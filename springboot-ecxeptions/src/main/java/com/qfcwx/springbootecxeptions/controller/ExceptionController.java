package com.qfcwx.springbootecxeptions.controller;

import com.qfcwx.springbootecxeptions.pojo.CustomerException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: ExceptionController
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/12 14:20
 * @Version 1.0
 **/
@Controller
public class ExceptionController {

    @GetMapping(value = "/api/error")
    @ResponseBody
    public Object exception() {
        int i = 1/0;
        return i;
    }

    @GetMapping(value = "/api/error/customer")
    public Object error() {
        throw new CustomerException("-1","我也不知道的异常~");
    }

}
