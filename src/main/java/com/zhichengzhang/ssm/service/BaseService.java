package com.zhichengzhang.ssm.service;

import java.io.Serializable;
import java.util.List;

/**
 * sevice 通用接口
 * @param <T>
 */
public interface BaseService<T,K> {

        boolean save(T t);
        boolean update(T t);
        boolean delete(T t);
        List<T> queryList(T t);

         T getById(K k);

}
