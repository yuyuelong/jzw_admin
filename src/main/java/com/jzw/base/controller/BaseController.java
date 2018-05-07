package com.jzw.base.controller;

import com.jzw.base.service.IBaseService;
import com.jzw.common.JSONDto;
import com.jzw.common.Pager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 控制层
 * Created by admin on 2017/5/27.
 */
public abstract class BaseController<K,T> {

    /**保存对象**/
    @PostMapping("save")
    public JSONDto<T> save(T entity){
        return getBaseService().save(entity);
    }

    /**删除对象**/
    @GetMapping("delete/id/{id}")
    public JSONDto<T> delete(@PathVariable("id") K key){
        return getBaseService().delete(key);
    }

    /**修改对象**/
    @PostMapping("update")
    public JSONDto<T> update(K key,T entity){
        return getBaseService().update(key,entity);
    }

    /**详细信息**/
    @GetMapping("findById/id/{id}")
    public JSONDto<T> findById(@PathVariable("id") K key){
        return getBaseService().findById(key);
    }

    /**数据集合**/
    @GetMapping("findAllByKey")
    public JSONDto<T> findAllByKey(T entity){
        return getBaseService().findAllByKey(entity);
    }

    /**每页数据包含模糊查询**/
    @PostMapping("pager")
    public JSONDto<T> pager(T entity, Pager<T> pager){
        return getBaseService().pager(entity,pager);
    }

    /**业务对象**/
    protected abstract IBaseService<K,T> getBaseService();
}
