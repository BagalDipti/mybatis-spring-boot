package com.mybatis.mybatis_demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mybatis.mybatis_demo.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {



@Autowired
private EmpMapper empMapper;





    @GetMapping("/all")
    public List<Employee> getAll(){
        return empMapper.findAll();
    }

    @GetMapping("/update")
    private List<Employee> update() {

        Employee emp = new Employee();
        emp.setName("Harsh");
        emp.setSalary(50000L);

        empMapper.insert(emp);

        return empMapper.findAll();
    }

    @GetMapping("/updateEmp")
    private List<Employee> updateEmployees(){
        Employee emp = new Employee();
        emp.setName("Harsh");
        emp.setSalary(40000L);
        empMapper.update(emp);

        return empMapper.findAll();
    }

    @GetMapping("/deleteEmp")
    private List<Employee> deleteEmployees(){
        Employee emp = new Employee();
        emp.setName("Harsh");
        empMapper.delete(emp);

        return empMapper.findAll();
    }



}
