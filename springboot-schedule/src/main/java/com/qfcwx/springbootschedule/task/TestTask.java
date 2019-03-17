package com.qfcwx.springbootschedule.task;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @ClassName: TestTask
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/17 9:38
 * @Version 1.0
 **/
@Component
public class TestTask {

    /**
     * 定期执行一次
     */
    //@Scheduled(fixedRate = 2000)
    public void taskMethod(){
        System.out.println("两秒执行一次"+new Date());
    }
}
