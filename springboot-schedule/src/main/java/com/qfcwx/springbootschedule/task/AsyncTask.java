package com.qfcwx.springbootschedule.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @ClassName: AsyncTask
 * @Author: 清风一阵吹我心
 * @Description: TODO  异步任务类
 * @Date: 2019/3/17 10:04
 * @Version 1.0
 **/
@Component
@Async
public class AsyncTask {


    public void method1() throws InterruptedException {
        long begin = System.currentTimeMillis();
        Thread.sleep(1000L);
        long end = System.currentTimeMillis();
        System.out.println("任务一耗时:" + (end - begin));
    }

    public void method2() throws InterruptedException {
        long begin = System.currentTimeMillis();
        Thread.sleep(2000L);
        long end = System.currentTimeMillis();
        System.out.println("任务二耗时:" + (end - begin));
    }

    public void method3() throws InterruptedException {
        long begin = System.currentTimeMillis();
        Thread.sleep(3000L);
        long end = System.currentTimeMillis();
        System.out.println("任务三耗时:" + (end - begin));
    }

}
