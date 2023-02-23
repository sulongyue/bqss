package com.bqss.service.impl;

import com.bqss.Exception.BusinessException;
import com.bqss.constant.CommonConstant;
import com.bqss.entity.ums.UserVO;
import com.bqss.repository.UserMapper;
import com.bqss.service.UserService;
import com.bqss.entity.ums.User;
import com.bqss.entity.ums.UserDTO;
import com.bqss.thread.UserThreadLocal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

/**
 * @Description TODO
 * @Date 2023/2/20 20:25
 * @Created by 18355
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addUser(UserDTO userDto) {
        User userDo = userMapper.selectByMobile(userDto.getMobile());
        if(Objects.nonNull(userDo)){
            throw new BusinessException(CommonConstant.PARAM_ERROR,"该手机号码已存在");
        }
        //密码加密,这里就不加密了
        User userPo = User.builder().mobile(userDto.getMobile())
                .password(userDto.getPassword())
                .idCard(userDto.getIdCard())
                .realName(userDto.getRealName())
                .email(userDto.getEmail()).build();

        userMapper.addUser(userPo);
    }

    @Override
    public UserVO getUserById(Integer id) {
        User user = userMapper.selectById(id);
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(user,userVO);
        return userVO;
    }
}
