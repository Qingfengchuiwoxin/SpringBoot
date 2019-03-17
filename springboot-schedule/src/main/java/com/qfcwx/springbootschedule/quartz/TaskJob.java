package com.qfcwx.springbootschedule.quartz;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

/**
 * @ClassName: TaskJob
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/17 10:30
 * @Version 1.0
 **/
@Component
@EnableScheduling
public class TaskJob {

    public void task1(){
        System.out.println("执行任务1");
    }

    public void task2(){
        System.out.println("执行任务2");
    }
}
