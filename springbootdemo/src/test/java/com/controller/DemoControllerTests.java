package com.controller;

import com.demo.controller.DemoController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Created by syp on 2019/1/3.
 * 单元测试
 */


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoControllerTests {

    private MockMvc mvc;

    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new DemoController()).build();
    }



    @Test
    public void getHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/index").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }
}
