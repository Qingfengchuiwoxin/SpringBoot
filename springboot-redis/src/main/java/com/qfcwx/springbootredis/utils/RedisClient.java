package com.qfcwx.springbootredis.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @ClassName: RedisClient
 * @Author: 清风一阵吹我心
 * @Description: TODO  操作Redis的工具类
 * @Date: 2019/3/14 16:02
 * @Version 1.0
 **/
@Component
public class RedisClient {

    @Autowired
    private StringRedisTemplate template;

    /**
     * 设置key-value
     * @param key
     * @param value
     * @return
     */
    public boolean set(String key, String value) {
        try {
            template.opsForValue().set(key, value);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 根据key获取value
     * @param key
     * @return
     */
    public String get(String key){
        return template.opsForValue().get(key);
    }



}
