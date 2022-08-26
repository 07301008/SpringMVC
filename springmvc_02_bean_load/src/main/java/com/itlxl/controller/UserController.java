package com.itlxl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 使用@Controller定义bean
@Controller
public class UserController {
    // 3、设置当前操作的访问路径
    @RequestMapping("/save")
    // 4、设置当前操作的返回值类型
    @ResponseBody
    public String save(){
        System.out.println("user save ...");
        return "{'module':'springmvc'}";
    }

    @RequestMapping("/delete")
    // 4、设置当前操作的返回值类型
    @ResponseBody
    public String delete(){
        System.out.println("user delete ...");
        return "{'module':'springmvc delete'}";
    }
}
