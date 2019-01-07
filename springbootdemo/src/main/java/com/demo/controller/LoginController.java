package com.demo.controller;

import com.demo.entity.SystemUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by syp on 2019/1/7.
 */
@Controller
@RequestMapping(value = "/system")
public class LoginController extends BaseController{


    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }


    @RequestMapping(value = "/index")
    @ResponseBody
    public Map<String, Object> index(SystemUser systemUser){
        System.out.println(systemUser.toString());
        return successMsg();
    }


}
