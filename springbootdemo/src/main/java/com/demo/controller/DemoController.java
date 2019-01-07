package com.demo.controller;

/**
 * Created by syp on 2019/1/3.
 * 测试类
 */

import com.demo.service.serviceImpl.SystemUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 这里的@RestController   相当于@ResponseBody + @Controller
 */
@RestController
@RequestMapping(value = "/demo")
public class DemoController {


    @Autowired
    private SystemUserServiceImpl systemUserService;


    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "成功！！";
    }


    @RequestMapping(value = "/findList",method = RequestMethod.POST)
    public Map<String,Object> findList(){
        Map<String,Object> map = new HashMap<>();
        map.put("data",systemUserService.findList());
        return map;
    }
}
