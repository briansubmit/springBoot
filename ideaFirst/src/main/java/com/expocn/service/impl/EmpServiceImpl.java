package com.expocn.service.impl;

import com.expocn.mapper.EmpMapper;
import com.expocn.model.Emp;
import com.expocn.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public void insert(Emp emp) {
        empMapper.insert(emp);

    }

    @Override
    public Emp getEmpById(int id) {
        return empMapper.getEmpById(id);

    }

    @Override
    public List<Emp> getEmps() {
        return empMapper.getEmps();
    }

    @Override
    public void update(Emp emp) {
        empMapper.update(emp);

    }

    @Override
    public void deleteById(int id) {
        empMapper.deleteById(id);
    }
}
