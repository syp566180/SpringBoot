package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by syp on 2019/1/7.
 */
@Controller
@RequestMapping(value = "/system")
public class LoginController {


    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }

}
