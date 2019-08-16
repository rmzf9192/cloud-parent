package com.el.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Auther: roman.zhang
 * @Date: 2019/3/20 20:31
 * @Version:V1.0
 * @Description:DeptConsumer_DashBoard_App
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_DashBoard_App {
    public static void main(String[] args)
    {
        SpringApplication.run(DeptConsumer_DashBoard_App.class,args);
    }

}
