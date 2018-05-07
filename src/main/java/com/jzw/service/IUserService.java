package com.jzw.service;

import com.jzw.base.service.IBaseService;
import com.jzw.common.JSONDto;
import com.jzw.entity.User;

/**
 * 用户业务逻辑处理接口
 * Created by admin on 2017/5/31.
 */
public interface IUserService extends IBaseService<Integer,User>{

    /**用户登录**/
    JSONDto<User> login(User user);
}
