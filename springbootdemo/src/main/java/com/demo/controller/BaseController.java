package com.demo.controller;

import com.demo.utils.MsgUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by syp on 2019/1/7.
 */
public class BaseController {


    public static Map<String,Object> successMsg(){
        Map<String,Object> map = new HashMap<>();
        map.put("resultCode",MsgUtil.Status.SUCCESS);
        map.put("resultMsg", MsgUtil.Msg.SUCCESS_MSG);
        return map;
    }

}
