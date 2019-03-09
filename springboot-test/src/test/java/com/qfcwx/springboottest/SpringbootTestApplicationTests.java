package com.qfcwx.springboottest;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootTestApplicationTests {

    private static final Map<String, Object> HASH_MAP = new HashMap<>();

    /**
     * 在执行test之前执行,先执行before
     */
    @Before
    public void before() {
        System.out.println("start");
        HASH_MAP.put("name", "清风");
    }

    /**
     * 执行test之后执行
     */
    @After
    public void after() {
        System.out.println("stop");
        HASH_MAP.clear();
    }

    /**
     * 两种断言的方式测试
     */
    @Test
    public void fun1() {
        System.out.println("开始测试");
        Assert.assertEquals(1, 2);
        TestCase.assertEquals(1, 1);
    }

    @Test
    public void fun2() {
        Set<Map.Entry<String, Object>> entrySet = HASH_MAP.entrySet();
        for (Map.Entry<String, Object> entry : entrySet) {
            String key = entry.getKey();
            Object value = entry.getValue();
            Assert.assertEquals("清风", value);
        }
    }

}
