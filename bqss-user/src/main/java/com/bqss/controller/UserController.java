package com.bqss.controller;

import com.bqss.api.Result;
import com.bqss.entity.ums.User;
import com.bqss.entity.ums.UserDTO;
import com.bqss.entity.ums.UserVO;
import com.bqss.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author jinguobiao
 * @Descriprion
 * @createTime 2022/7/12
 */
@Api("User服务接口")
@Slf4j
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String test(){
        return "hello bqss";
    }

    @ApiOperation("添加用户")
    @PostMapping("/user")
    public Result addUser(@Validated @RequestBody UserDTO userDto){
        userService.addUser(userDto);
        return Result.ok();
    }

    @ApiOperation("根据id查询用户")
    @GetMapping("/user/{id}")
    public Result<UserVO> getUserById(@PathVariable("id") Integer id){
        UserVO userVO = userService.getUserById(id);
        return Result.ok(userVO);
    }
}
