package com.zhichengzhang.ssm.service.impl;

import com.zhichengzhang.ssm.base.MapperUtil;
import com.zhichengzhang.ssm.service.BaseService;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Transactional
public abstract class BaseServiceImpl<T,K> implements BaseService<T,K> {


    /**
     * 由业务类实现
     * @return
     */
    public abstract MapperUtil<T> getMapperUtil();


    @Override
    public boolean save(T t) {
        return getMapperUtil().insert(t)>0?true:false;
    }

    @Override
    public boolean update(T t) {
        return getMapperUtil().updateByPrimaryKeySelective(t)>0?true:false;
    }

    @Override
    public boolean delete(T t) {
        return getMapperUtil().delete(t)>0?true:false;
    }

    @Override
    public List<T> queryList(T t) {
        return  getMapperUtil().select(t);
    }

    @Override
    public T getById(K k) {
        return getMapperUtil().selectByPrimaryKey(k);
    }
}
