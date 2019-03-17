package com.qfcwx.springbootschedule.quartz;

import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;

/**
 * @ClassName: QuartzConfig
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/17 10:32
 * @Version 1.0
 **/
@Configuration
public class QuartzConfig {

    /**
     * 配置定时任务一
     * @param taskJob
     * @return
     */
    @Bean(name = "firstJobDetail")
    public MethodInvokingJobDetailFactoryBean firstJobDetail(TaskJob taskJob){
        MethodInvokingJobDetailFactoryBean jobDetail =new MethodInvokingJobDetailFactoryBean();
        //是否并发执行
        jobDetail.setConcurrent(true);
        //需要执行的实体类名称
        jobDetail.setTargetObject(taskJob);
        //需要执行的方法
        jobDetail.setTargetMethod("task1");
        return jobDetail;
    }

    /**
     * 配置触发器
     * @param firstJobDetail
     * @return
     */
    @Bean(name = "firstTrigger")
    public SimpleTriggerFactoryBean firstTrigger(JobDetail firstJobDetail){
        SimpleTriggerFactoryBean trigger = new SimpleTriggerFactoryBean();
        trigger.setJobDetail(firstJobDetail);
        //设置任务启动延时
        trigger.setStartDelay(0);
        // 每两秒
        trigger.setRepeatInterval(10000);
        return trigger;
    }

    /**
     * 配置定时任务二
     * @param taskJob
     * @return
     */
    @Bean(name = "secondJobDetail")
    public MethodInvokingJobDetailFactoryBean secondJobDetail(TaskJob taskJob){
        MethodInvokingJobDetailFactoryBean jobDetail = new MethodInvokingJobDetailFactoryBean();
        //是否并发执行
        jobDetail.setConcurrent(true);
        //需要执行的实体类名称
        jobDetail.setTargetObject(taskJob);
        //需要执行的方法
        jobDetail.setTargetMethod("task2");
        return jobDetail;
    }

    @Bean(name = "secondTrigger")
    public CronTriggerFactoryBean secondTrigger(JobDetail secondJobDetail){
        CronTriggerFactoryBean trigger = new CronTriggerFactoryBean();
        trigger.setJobDetail(secondJobDetail);
        trigger.setStartDelay(0);
        trigger.setCronExpression("*/1 * * * * ?");
        return trigger;
    }

    @Bean
    public SchedulerFactoryBean schedulerFactory(Trigger firstTrigger,Trigger secondTrigger){
        SchedulerFactoryBean bean = new SchedulerFactoryBean();
        bean.setStartupDelay(5);
        bean.setTriggers(firstTrigger,secondTrigger);
        return bean;
    }



}
