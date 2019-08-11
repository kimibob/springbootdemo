package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController /**自动返回的是json格式数据，不是页面路径***/
@RequestMapping("user")
public class UserController {

	@Autowired
    private UserService userService;

    @PostMapping("/hello")
    public String hello(){
        return "hello SpringBoot";
    }

    @PostMapping("/selectById")
    public User selectById(Integer id){
        return userService.selectById(id);
    }
}

