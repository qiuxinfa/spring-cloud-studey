package com.qxf.service;

import com.qxf.pojo.Dept;

import java.util.List;

/**
 * @Auther: qiuxinfa
 * @Date: 2020/4/29
 * @Description: com.qxf.service
 */
public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
