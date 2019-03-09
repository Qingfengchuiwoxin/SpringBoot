package com.qfcwx.springboottest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @ClassName: MockMvcRestFulTest
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/9 17:58
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
//测试环境使用，用来表示测试环境使用的ApplicationContext将是WebApplicationContext类型的
@WebAppConfiguration
public class MockMvcRestFulTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    private static final Logger LOGGER = LoggerFactory.getLogger(MockMvcRestFulTest.class);

    private static final String ALL_USER = "/v1/user";
    private static final String ONE_USER = "/v1/user/{id}";
    private static final String SAVE_USER = "/v1/user";
    private static final String DELETE_USER = "/v1/user/{id}";
    private static final String UPDATE_NAME_USER = "/v1/user/name";
    private static final String UPDATE_USER = "/v1/user";
    @Before
    public void setUp() throws Exception{
        //指定WebApplicationContext，将会从该上下文获取相应的控制器并得到相应的MockMvc；
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void findAll() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get(ALL_USER))
                .andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
        int status = result.getResponse().getStatus();
        String content = result.getResponse().getContentAsString();
        LOGGER.info("status:{}",status);
        LOGGER.info("content:{}",content);
    }

    @Test
    public void findOne() throws Exception {
        String content = mockMvc.perform(MockMvcRequestBuilders.get(ONE_USER, 1))
                .andReturn().getResponse().getContentAsString();
        LOGGER.info("content:{}",content);
    }

    @Test
    public void delete() throws Exception {
        String content = mockMvc.perform(MockMvcRequestBuilders.delete(DELETE_USER, 1))
                .andReturn().getResponse().getContentAsString();
        LOGGER.info("content:{}",content);
    }


}
