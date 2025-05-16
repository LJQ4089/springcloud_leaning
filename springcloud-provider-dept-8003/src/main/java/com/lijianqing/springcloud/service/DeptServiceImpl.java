package com.lijianqing.springcloud.service;

import com.lijianqing.pojo.Dept;
import com.lijianqing.springcloud.dao.DeptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public Dept getDeptById(Long id) {
        return deptDao.queryById(id);
    }

    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }
}
