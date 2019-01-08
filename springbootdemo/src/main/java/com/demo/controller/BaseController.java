package com.demo.controller;

import com.demo.utils.MsgUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by syp on 2019/1/7.
 */
public class BaseController {


    /**
     * 成功
     * @return
     */
    public static Map<String,Object> successMsg(){
        Map<String,Object> map = new HashMap<>();
        map.put("resultCode",MsgUtil.Status.SUCCESS);
        map.put("resultMsg", MsgUtil.Msg.SUCCESS_MSG);
        return map;
    }


    /**
     * 成功，带参数
     * @return
     */
    public static Map<String,Object> successMsg(Map<String,Object> m){
        Map<String,Object> map = new HashMap<>();
        map.put("resultData",m);
        map.put("resultCode",MsgUtil.Status.SUCCESS);
        map.put("resultMsg", MsgUtil.Msg.SUCCESS_MSG);
        return map;
    }

    /**
     * 失败
     * @return
     */
    public static Map<String,Object> errorMsg(){
        Map<String,Object> map = new HashMap<>();
        map.put("resultCode",MsgUtil.Status.ERROR);
        map.put("resultMsg", MsgUtil.Msg.ERROR_MSG);
        return map;
    }




}
