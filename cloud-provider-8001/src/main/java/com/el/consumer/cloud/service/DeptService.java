package com.el.consumer.cloud.service;

import com.el.consumer.cloud.entities.Dept;

import java.util.List;

/**
 * @Auther: roman.zhang
 * @Date: 2019/3/19 10:51
 * @Version:V1.0
 * @Description:DeptService
 */
public interface DeptService {
     boolean add(Dept dept);
     Dept    get(Long id);
     List<Dept> list();

}
