package com.codegym.model.service;


import com.codegym.model.entity.Branch;
import com.codegym.model.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeService extends GeneralService<Employee> {
    Iterable<Employee> findAllByBranch(Branch staff);
    List<Employee> findEmployeeByAge();
    List<Employee> findEmployeeByBranch(Integer id);
}