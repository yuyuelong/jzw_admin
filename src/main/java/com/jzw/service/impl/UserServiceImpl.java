package com.jzw.service.impl;

import com.jzw.base.mapper.BaseMapper;
import com.jzw.base.service.impl.BaseServiceImpl;
import com.jzw.common.JSONDto;
import com.jzw.entity.User;
import com.jzw.mapper.UserMapper;
import com.jzw.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户业务逻辑实现类
 * Created by admin on 2017/5/31.
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<Integer,User> implements IUserService {

    /**注入UserMapper代理对象**/
    @Autowired
    private UserMapper userMapper;

    @Override
    public JSONDto<User> login(User user) {
        user = userMapper.login(user);
        return new JSONDto<>("200","success",user);
    }

    /**Mapper代理对象**/
    @Override
    protected BaseMapper<Integer, User> getBaseMapper() {
        return userMapper;
    }
}
