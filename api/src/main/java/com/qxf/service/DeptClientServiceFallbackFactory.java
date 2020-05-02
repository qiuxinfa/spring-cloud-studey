package com.qxf.service;

import com.qxf.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: qiuxinfa
 * @Date: 2020/5/2
 * @Description: com.qxf.service
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>{
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean addDept(Dept dept) {
                return false;
            }

            @Override
            public Dept findById(Long id) {
                return new Dept().setDeptno(id).setDb_source("no database")
                        .setDname("服务繁忙，请稍后再试！");
            }

            @Override
            public List<Dept> findAll() {
                return null;
            }
        };
    }
}
