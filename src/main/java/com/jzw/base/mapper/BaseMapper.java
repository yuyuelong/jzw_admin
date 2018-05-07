package com.jzw.base.mapper;

import com.jzw.common.JSONDto;
import com.jzw.common.Pager;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Mapper代理对象
 * Created by admin on 2017/5/27.
 */
public interface BaseMapper<K,T> {

    /**保存信息**/
    int save(@Param("entity") T entity);

    /**删除信息**/
    int delete(@Param("key") K key);

    /**修改信息**/
    int update(@Param("key") K key,@Param("entity") T entity);

    /**详细信息**/
    T findById(@Param("key")K key);

    /**总记录数**/
    int recordTotal(@Param("entity") T entity);

    /**数据集合**/
    <T> List<T> findAllByKey(@Param("entity") T entity);

    /**每页数据**/
    <T> List<T> pagerData(@Param("entity") T entity,@Param("pager") Pager<T> pager);

}
