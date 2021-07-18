package com.lin.employeemanager.repo;

import com.lin.employeemanager.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    //query methods
    void deleteById(Long id);
    Optional<Employee> findEmployeeById(Long id);
}
