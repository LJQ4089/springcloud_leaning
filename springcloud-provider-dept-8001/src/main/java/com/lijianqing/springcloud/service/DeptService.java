package com.lijianqing.springcloud.service;

import com.lijianqing.pojo.Dept;

import java.util.List;

public interface DeptService {
    public Dept getDeptById(Long id);
    public List<Dept> queryAll();
    public boolean addDept(Dept dept);
}
