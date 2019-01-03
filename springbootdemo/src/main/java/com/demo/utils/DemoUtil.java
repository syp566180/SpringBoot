package com.demo.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by syp on 2019/1/3.
 */
@Component
public class DemoUtil {






    //获取当前
    public void getDate(){
        System.out.println(new Date());
    }
}
