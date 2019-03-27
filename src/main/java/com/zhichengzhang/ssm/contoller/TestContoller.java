package com.zhichengzhang.ssm.contoller;

import com.zhichengzhang.ssm.model.ImPermission;
import com.zhichengzhang.ssm.service.ImPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestContoller {

    @Autowired
    ImPermissionService imPermissionService;

    @RequestMapping("/sayHello")
    public String sayHello(Model model){

        ImPermission imPermission=  imPermissionService.getById(1);
        model.addAttribute("info","hello");
        model.addAttribute("test",imPermission.getName());
        model.addAttribute("test2",imPermission.getId());
        model.addAttribute("test3",imPermission.getId());
        return "add";
    }
}
