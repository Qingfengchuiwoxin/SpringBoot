package com.qfcwx.springbootecxeptions.handler;

import com.qfcwx.springbootecxeptions.pojo.CustomerException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: CustomerExceptionHandler
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/12 14:34
 * @Version 1.0
 **/
@ControllerAdvice
public class CustomerExceptionHandler {

    @ExceptionHandler(value = CustomerException.class)
    @ResponseBody
    public Object handler(Exception e) {
        CustomerException exception = (CustomerException) e;
        Map<String, Object> map = new HashMap<>();
        map.put("code", exception.getCode());
        map.put("msg", exception.getMsg());
        return map;
    }

}
