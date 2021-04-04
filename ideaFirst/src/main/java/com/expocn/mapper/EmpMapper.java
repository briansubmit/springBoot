package com.expocn.mapper;

import com.expocn.model.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {
    public void insert(Emp emp);
    public Emp getEmpById(int id);
    public List<Emp> getEmps();
    public void update(Emp emp);
    public void deleteById(int id);
}
