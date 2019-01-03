package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by syp on 2019/1/3.
 *
 * 测试 入口配置类注解信息
 *
 *
 */
@ComponentScan
public class DemoApplication {

    @Bean
    public Runnable createRunnable(){
        return () -> System.out.println("spring boot is running");
    }


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class,args);
        context.getBean(Runnable.class).run();
    }
}
