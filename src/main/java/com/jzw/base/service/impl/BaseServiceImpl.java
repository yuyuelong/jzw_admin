package com.jzw.base.service.impl;

import com.jzw.base.mapper.BaseMapper;
import com.jzw.base.service.IBaseService;
import com.jzw.common.JSONDto;
import com.jzw.common.Pager;

import java.util.List;

/**
 * 业务逻辑实现类
 * Created by admin on 2017/5/27.
 */
public abstract class BaseServiceImpl<K,T> implements IBaseService<K, T> {

    /**保存对象**/
    @Override
    public JSONDto<T> save(T entity) {
        getBaseMapper().save(entity);
        return new JSONDto<>("200","success",null);
    }

    /**删除对象**/
    @Override
    public JSONDto<T> delete(K key) {
        getBaseMapper().delete(key);
        return null;
    }

    /**修改对象**/
    @Override
    public JSONDto<T> update(K key, T entity) {
        getBaseMapper().update(key,entity);
        return null;
    }

    /**详细信息**/
    @Override
    public JSONDto<T> findById(K key) {
        getBaseMapper().findById(key);
        return null;
    }

    /**数据集合**/
    @Override
    public JSONDto<T> findAllByKey(T entity) {
        getBaseMapper().findAllByKey(entity);
        return null;
    }

    /**页对象**/
    @Override
    public JSONDto<T> pager(T entity,Pager<T> pager) {
        pager.setRecordTotal(recordTotal(entity));//总记录数
        pager.setContent(pagerData(entity,pager));//每页数据
        return null;
    }

    /**总记录数**/
    public int recordTotal(T entity){
        return getBaseMapper().recordTotal(entity);
    }

    /**每页数据**/
    public List<T> pagerData(T entity,Pager<T> pager){
        return getBaseMapper().pagerData(entity,pager);
    }

    /**Mapper代理对象**/
    protected abstract BaseMapper<K,T> getBaseMapper();
}
