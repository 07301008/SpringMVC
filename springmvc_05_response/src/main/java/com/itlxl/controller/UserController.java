package com.itlxl.controller;

import com.itlxl.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

// 使用@Controller定义bean
@Controller
public class UserController {
    // 响应页面/跳转页面
    @RequestMapping("/toJumpPage")
    public String toJumpPage(){
        System.out.println("跳转页面");
        return "page.jsp";
    }

    // 响应文本数据
    @RequestMapping("/toText")
    @ResponseBody
    public String toText(){
        System.out.println("返回纯文本数据");
        return "response text";
    }

    // 响应POJO对象
    @RequestMapping("/toJsonPOJO")
    @ResponseBody
    public User toJsonPOJO(){
        System.out.println("返回json对象数据");
        User user = new User();
        user.setName("itzhangsan");
        user.setAge(15);
        return user;
    }

    // 响应POJO集合对象
    @RequestMapping("/toJsonListPOJO")
    @ResponseBody
    public List<User> toJsonListPOJO(){
        System.out.println("返回json集合对象数据");
        User user1 = new User();
        user1.setName("张三");
        user1.setAge(15);

        User user2 = new User();
        user2.setName("李四");
        user2.setAge(16);

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        return users;
    }
}
