package com.expocn.service;

import com.expocn.model.Emp;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//事务
@Transactional
public interface EmpService {
    public void insert(Emp emp);
    public Emp getEmpById(int id);
    public List<Emp> getEmps();
    public void update(Emp emp);
    public void deleteById(int id);
}
