package com.qfcwx.springbootecxeptions.handler;

import com.qfcwx.springbootecxeptions.pojo.CustomerException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName: CustomerExceptionHandler
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/12 14:34
 * @Version 1.0
 **/
@ControllerAdvice
public class CustomerExceptionHandler {

    //返回json
//    @ExceptionHandler(value = CustomerException.class)
//    @ResponseBody
//    public Object handler(CustomerException ce) {
//        Map<String, Object> map = new HashMap<>();
//        map.put("code", ce.getCode());
//        map.put("msg", ce.getMsg());
//        return map;
//    }

    /**
     * 返回页面
     * @param ce
     * @return
     */
    @ExceptionHandler(value = CustomerException.class)
    public ModelAndView handlerPage(CustomerException ce){
        ModelAndView view = new ModelAndView();
        view.setViewName("error");
        view.addObject("code",ce.getCode());
        view.addObject("msg",ce.getMsg());
        return view;
    }


}
