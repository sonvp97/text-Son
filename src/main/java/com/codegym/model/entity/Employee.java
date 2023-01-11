package com.codegym.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "Employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String employeeCode;
    private String name;
    private Integer age;
    private Integer salary;
    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;

    public Employee() {
    }

    public Employee(String employeeCode, String name, Integer age, Integer salary, Branch branch) {
        this.employeeCode = employeeCode;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.branch = branch;
    }

    public Employee(Long id, String employeeCode, String name, Integer age, Integer salary, Branch branch) {
        this.id = id;
        this.employeeCode = employeeCode;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.branch = branch;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
}
