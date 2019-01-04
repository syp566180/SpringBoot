package com.demo;

import com.demo.utils.DemoUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


//用来声明这是启动SpringBoot程序的启动类，必须有
@SpringBootApplication
@MapperScan("com.demo.dao")
public class SpringbootdemoApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootdemoApplication.class, args);
        DemoUtil demoUtil = context.getBean(DemoUtil.class);
        demoUtil.getDate();
    }
}