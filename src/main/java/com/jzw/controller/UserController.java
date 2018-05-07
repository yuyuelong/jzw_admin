package com.jzw.controller;

import com.jzw.base.controller.BaseController;
import com.jzw.base.service.IBaseService;
import com.jzw.common.JSONDto;
import com.jzw.entity.User;
import com.jzw.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户
 * Created by admin on 2017/5/31.
 */
@RestController
@RequestMapping("user")
public class UserController extends BaseController<Integer,User> {

    /**注入IUserService接口对象**/
    @Autowired
    private IUserService userService;

    /**用户登录**/
    @PostMapping("login")
    public JSONDto<User> login(@RequestBody User user){
        return userService.login(user);
    }

    /**业务逻辑接口**/
    @Override
    protected IBaseService<Integer, User> getBaseService() {
        return userService;
    }
}
