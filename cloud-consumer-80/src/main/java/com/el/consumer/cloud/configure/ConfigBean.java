package com.el.consumer.cloud.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: roman.zhang
 * @Date: 2019/3/19 13:59
 * @Version:V1.0
 * @Description:ConfigBean
 */
@Configuration

public class ConfigBean {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
