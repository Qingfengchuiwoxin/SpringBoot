package com.qfcwx.springbootschedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//开启定时任务
@EnableTransactionManagement
@EnableScheduling
//开启异步任务
@EnableAsync
public class SpringbootScheduleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootScheduleApplication.class, args);
    }

}
