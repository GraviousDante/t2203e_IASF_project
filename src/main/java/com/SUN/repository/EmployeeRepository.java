package com.SUN.repository;

import com.SUN.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    ScopedValue<Object> findById(String id);

    List<Employee> findByLastName(String lastName);
}
