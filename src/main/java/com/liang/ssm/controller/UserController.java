package com.liang.ssm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class UserController {

    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String login(){
        System.out.println("登录登录");
        return "OK";
    }
}
