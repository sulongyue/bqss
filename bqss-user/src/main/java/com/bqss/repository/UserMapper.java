package com.bqss.repository;

import com.bqss.entity.ums.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description TODO
 * @Date 2023/2/20 20:07
 * @Created by 18355
 */
@Mapper
public interface UserMapper {

    void addUser(User user);

    User selectById(Integer id);

    User selectByMobile(String mobile);
}
