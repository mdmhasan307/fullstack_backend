package com.lin.employeemanager.repo;

import com.lin.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

    //these method is called query method
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
