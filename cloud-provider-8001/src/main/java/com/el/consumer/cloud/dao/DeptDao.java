package com.el.consumer.cloud.dao;

import com.el.consumer.cloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: roman.zhang
 * @Date: 2019/3/19 10:45
 * @Version:V1.0
 * @Description:DeptDao
 */
@Mapper
public interface DeptDao {
    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();

}
