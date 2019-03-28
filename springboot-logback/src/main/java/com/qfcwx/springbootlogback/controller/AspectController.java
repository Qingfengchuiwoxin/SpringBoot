package com.qfcwx.springbootlogback.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: AspectController
 * @Author: 清风一阵吹我心
 * @Description: TODO 测试aop的功能
 * @Date: 2019/3/24 22:12
 * @Version 1.0
 **/
@RestController
public class AspectController {

    @GetMapping("/aop")
    public Map<String, String> getMapInfo(@RequestParam("name") String name, @RequestParam("password") String password) {
        Map<String, String> map = new HashMap<>();
        map.put("name", name);
        map.put("password", password);
        return map;
    }
}
