package com.qfcwx.springbootecxeptions.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: ExceptionHandlerClass
 * @Author: 清风一阵吹我心
 * @Description: TODO捕获全局异常，处理不可知的异常
 * @Date: 2019/3/12 14:15
 * @Version 1.0
 **/
@ControllerAdvice
public class ExceptionHandlerClass {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Map<String, Object> handlerException(Exception e, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 100);
        map.put("msg", e.getMessage());
        map.put("url", request.getRequestURL());
        return map;
    }

}
