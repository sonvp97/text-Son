package com.codegym.model.repository;



import com.codegym.model.entity.Branch;
import com.codegym.model.entity.Employee;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Long> {
    Iterable<Employee> findAllByBranch(Branch staff);
    @Query(
            nativeQuery = true,
            value = "select * from employees order by age")
    List<Employee> findEmployeeByAge();
    @Query(
            nativeQuery = true,
            value = "select e.id, e.age, e.employeeCode,e.`name`,e.salary,e.branch_id\n" +
                    "from employees e join branches b group by b.id = :id")
    List<Employee> findEmployeeByBranch(@Param("id") Integer id);
}
