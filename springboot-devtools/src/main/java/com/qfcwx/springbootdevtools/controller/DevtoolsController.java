package com.qfcwx.springbootdevtools.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: DevtoolsController
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/9 13:14
 * @Version 1.0
 **/
@RestController
public class DevtoolsController {

    @GetMapping("/hi")
    public String show(){
        return "你好啊";
    }
}
