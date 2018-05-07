package com.jzw.base.service;

import com.jzw.common.JSONDto;
import com.jzw.common.Pager;

/**
 * 业务逻辑处理接口
 * Created by admin on 2017/5/27.
 */
public interface IBaseService<K,T> {
    /**保存信息**/
    JSONDto<T> save(T entity);

    /**删除信息**/
    JSONDto<T> delete(K key);

    /**修改信息**/
    JSONDto<T> update(K key,T entity);

    /**详细信息**/
    JSONDto<T> findById(K key);

    /**数据集合信息**/
    JSONDto<T> findAllByKey(T entity);

    /**每页数据信息**/
    JSONDto<T> pager(T entity,Pager<T> pager);
}
