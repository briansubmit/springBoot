package com.expocn.controller;

import com.expocn.model.Emp;
import com.expocn.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class EmpController {
    @Autowired
    private EmpService empService;


    @PostMapping("insert")
    public String insert(Emp emp) {
        empService.insert(emp);
        return "redirect:main";
    }

    @GetMapping("getById")
    public Emp getEmpById(int id) {
        return empService.getEmpById(id);
    }


    @GetMapping("main")
    public String getEmps(Model model) {
        List<Emp> emps = empService.getEmps();
        model.addAttribute("emplist",emps);
        return "main";
    }

    @PostMapping("update")
    public String update(Emp emp) {
        empService.update(emp);
        return "success";
    }

    @GetMapping("delete")
    public String deleteById(int id) {
        empService.deleteById(id);
        return "success";
    }
}
