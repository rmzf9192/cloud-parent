package com.el.consumer.cloud.service;

import com.el.consumer.cloud.entities.Dept;
import com.el.consumer.cloud.service.impl.DeptClientServiceFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Auther: roman.zhang
 * @Date: 2019/3/19 16:43
 * @Version:V1.0
 * @Description:DeptClientService
 */
//@FeignClient(value = "cloud-dept")
@FeignClient(value = "cloud-dept",fallbackFactory= DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id);

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list();

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean add(Dept dept);
}
