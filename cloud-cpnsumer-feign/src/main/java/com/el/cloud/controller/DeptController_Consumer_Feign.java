package com.el.cloud.controller;

import com.el.consumer.cloud.entities.Dept;
import com.el.consumer.cloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Auther: roman.zhang
 * @Date: 2019/3/19 14:02
 * @Version:V1.0
 * @Description:DeptController_Consumer
 */
@RestController
public class DeptController_Consumer_Feign {

    @Autowired
    private DeptClientService service ;

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return this.service.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list()
    {
        return this.service.list();
    }

    @RequestMapping(value = "/consumer/dept/add")
    public Object add(Dept dept)
    {
        return this.service.add(dept);
    }

}
