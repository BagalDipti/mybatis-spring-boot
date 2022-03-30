package com.mybatis.mybatis_demo;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Employee {

    private String name;
    private Long salary;

    
    public Employee() {
        this.name = name;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Long getSalary() {
        return salary;
    }


    public void setSalary(Long salary) {
        this.salary = salary;
    }


    public Employee(String name, Long salary) {
        this.name = name;
        this.salary = salary;
    }

    
    
}
