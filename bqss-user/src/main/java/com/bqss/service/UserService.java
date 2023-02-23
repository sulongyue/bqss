package com.bqss.service;

import com.bqss.entity.ums.User;
import com.bqss.entity.ums.UserDTO;
import com.bqss.entity.ums.UserVO;

/**
 * @Description TODO
 * @Date 2023/2/20 20:24
 * @Created by 18355
 */
public interface UserService {

    void addUser(UserDTO userDto);

    UserVO getUserById(Integer id);
}
