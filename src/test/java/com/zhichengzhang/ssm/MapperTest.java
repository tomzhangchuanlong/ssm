package com.zhichengzhang.ssm;


import com.zhichengzhang.ssm.mapper.ImPermissionMapper;
import com.zhichengzhang.ssm.model.ImPermission;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner. class)
@SpringBootTest(classes=Application. class)
public class MapperTest {

    @Autowired
    ImPermissionMapper imPermissionMapper;


    @Test
    public void  imPermissTest(){
        ImPermission imPermission = new ImPermission();

        imPermission.setId(1);
        imPermission = imPermissionMapper.selectOne(imPermission);

    }

    @Test
    public void messageInfo(){

        RowBounds rowBounds = new RowBounds(0,3);
        Example example = new Example(ImPermission.class);
        Example.Criteria query =  example.createCriteria();
        //query.andEqualTo("id",1);

        List<ImPermission> imPermissionList= imPermissionMapper.selectByExampleAndRowBounds(example,rowBounds);
        for (ImPermission im :
                imPermissionList) {
            System.out.println("==============>"+im.getName());

        }
    }
}
