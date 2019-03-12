package com.qfcwx.springbootecxeptions.controller;

import com.qfcwx.springbootecxeptions.pojo.CustomerException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ExceptionController
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/12 14:20
 * @Version 1.0
 **/
@RestController
public class ExceptionController {

    @GetMapping(value = "/api/error")
    public Object exception() {
        String phone = "18600998237";
        int parseInt = Integer.parseInt(phone);
        return parseInt;
    }

    @GetMapping(value = "/api/error/customer")
    public Object error() {
        String[] str = new String[]{"数组交表越界", "空指针异常", "数字格式化异常"};
        for (String s : str) {
            if ("空指针异常".equals(s)) {
                throw new CustomerException("1",s);
            }else{
                throw new CustomerException("-1","未知异常");
            }
        }
        return null;
    }

}
