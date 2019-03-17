package com.qfcwx.springbootschedule.controller;

import com.qfcwx.springbootschedule.task.AsyncTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TaskController
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/17 9:39
 * @Version 1.0
 **/
@RestController
public class TaskController {

    @Autowired
    private AsyncTask asyncTask;

    @GetMapping("/asnc")
    public void exeAsync() throws InterruptedException {
        long begin = System.currentTimeMillis();
        asyncTask.method1();
        asyncTask.method2();
        asyncTask.method3();
        long end = System.currentTimeMillis();
        System.out.println("执行总耗时:" + (end - begin));
    }
}
