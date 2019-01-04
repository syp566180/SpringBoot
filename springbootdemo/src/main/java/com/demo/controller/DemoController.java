package com.demo.controller;

/**
 * Created by syp on 2019/1/3.
 * 测试类
 */
import com.demo.service.SystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这里的@RestController   相当于@ResponseBody + @Controller
 */
@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "成功！！";
    }


    @Autowired
    private SystemUserService systemUserService;



}
