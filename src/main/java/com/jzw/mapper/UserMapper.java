package com.jzw.mapper;

import com.jzw.base.mapper.BaseMapper;
import com.jzw.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 用户Mapper代理对象
 * Created by admin on 2017/5/31.
 */
@Mapper
public interface UserMapper extends BaseMapper<Integer,User>{
    User login(@Param("user")User user);
}
