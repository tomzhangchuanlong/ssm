package com.zhichengzhang.ssm.service.impl;

import com.zhichengzhang.ssm.base.MapperUtil;
import com.zhichengzhang.ssm.mapper.ImPermissionMapper;
import com.zhichengzhang.ssm.model.ImPermission;
import com.zhichengzhang.ssm.service.ImPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("imPermissionService")
public class ImPermissionServiceImpl extends BaseServiceImpl<ImPermission,Integer> implements ImPermissionService {

    @Autowired
    ImPermissionMapper imPermissionMapper;

    @Override
    public MapperUtil getMapperUtil() {
        return imPermissionMapper;
    }
}
