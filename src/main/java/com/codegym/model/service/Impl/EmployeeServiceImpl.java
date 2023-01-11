package com.codegym.model.service.Impl;


import com.codegym.model.entity.Branch;
import com.codegym.model.entity.Employee;

import com.codegym.model.repository.EmployeeRepository;
import com.codegym.model.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public Iterable<Employee> findAllByBranch(Branch staff) {
        return employeeRepository.findAllByBranch(staff);
    }

    @Override
    public List<Employee> findEmployeeByAge() {
        return employeeRepository.findEmployeeByAge();
    }

    @Override
    public List<Employee> findEmployeeByBranch(Integer id) {
        return employeeRepository.findEmployeeByBranch(id);
    }


    @Override
    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);

    }

    @Override
    public void remove(Long id) {
        employeeRepository.deleteById(id);
    }
}
