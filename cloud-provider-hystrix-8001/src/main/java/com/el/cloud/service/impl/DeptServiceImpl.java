package com.el.cloud.service.impl;

import com.el.cloud.dao.DeptDao;
import com.el.cloud.service.DeptService;
import com.el.consumer.cloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: roman.zhang
 * @Date: 2019/3/19 10:53
 * @Version:V1.0
 * @Description:DeptServiceImpl
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao dao ;


    @Override
    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return dao.findAll();
    }
}
