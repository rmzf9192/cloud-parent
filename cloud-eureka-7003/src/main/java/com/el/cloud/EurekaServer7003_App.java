package com.el.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: roman.zhang
 * @Date: 2019/3/19 15:39
 * @Version:V1.0
 * @Description:EurekaServer7002_App
 */
@SpringBootApplication
@EnableEurekaServer//EurekaServer服务器端启动类,接受其它微服务注册进来
public class EurekaServer7003_App {
    public static void main( String[] args )
    {

        SpringApplication.run(EurekaServer7003_App.class,args);
    }
}
