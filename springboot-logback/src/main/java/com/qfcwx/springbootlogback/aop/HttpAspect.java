package com.qfcwx.springbootlogback.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @ClassName: HttpAspect
 * @Author: 清风一阵吹我心
 * @Description: TODO 使用aop记录每一个请求
 * @Date: 2019/3/24 21:55
 * @Version 1.0
 **/
@Aspect
@Component
public class HttpAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.qfcwx.springbootlogback.controller.*.*(..))")
    public void log() {
    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //url
        LOGGER.info("url:{}", request.getRequestURL());
        //method
        LOGGER.info("method:{}", request.getMethod());
        //ip
        LOGGER.info("ip:{}", request.getRemoteAddr());
        //类方法
        LOGGER.info("class_method:{}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        //参数(joinPoint.getArgs()返回一个参数数组)
        LOGGER.info("args:{}", Arrays.asList(joinPoint.getArgs()));
    }

    @AfterReturning(returning = "object", pointcut = "log()")
    public void doAfterReturning(Object object) {
        LOGGER.info("response:{}", object.toString());
    }

}
