package com.el.cloud.controller;



import com.el.cloud.service.DeptService;
import com.el.consumer.cloud.entities.Dept;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: roman.zhang
 * @Date: 2019/3/19 10:55
 * @Version:V1.0
 * @Description:DeptController
 */
//@Controller
@RestController
public class DeptController {
    @Autowired
    private DeptService service=null;


    @RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") Long id)
    {
        Dept dept =  this.service.get(id);
        if(null == dept)
        {
            throw new RuntimeException("该ID："+id+"没有没有对应的信息");
        }
        return dept;
    }


    public Dept processHystrix_Get(@PathVariable("id") Long id){

        return new Dept().setDeptno(id).setDname("该ID："+id+"没有没有对应的信息,null--@HystrixCommand")
                .setDb_source("no this database in MySQL");
    }


}
