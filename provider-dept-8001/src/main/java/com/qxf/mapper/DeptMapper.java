package com.qxf.mapper;

import com.qxf.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: qiuxinfa
 * @Date: 2020/4/29
 * @Description: com.qxf.mapper
 */
@Mapper
public interface DeptMapper {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
