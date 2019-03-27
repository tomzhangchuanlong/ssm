package com.zhichengzhang.ssm.base;

import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;

public interface MapperUtil<T> extends Mapper<T> , ConditionMapper<T>, IdsMapper<T> {
}
