package com.SUN.service;

import com.SUN.entity.JpaEmployee;
import com.SUN.model.Employee;
import com.SUN.repository.EmployeeRepository;
import com.SUN.repository.JpaEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService<JpaEmployeeRepository> {

    @Autowired
    private EmployeeRepository employeeRepository;  // MongoDB repository

    @Autowired
    private JpaEmployeeRepository jpaEmployeeRepository;  // JPA repository

    // Method to create an employee
    public void createEmployee(String firstName, String lastName, String department) {
        Employee employee = new Employee();
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employeeRepository.save(employee);  // Save to MongoDB
    }

    // Method to find all employees
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();  // Find all from MongoDB
    }

    // Method to find all employees using JPA
    public List<JpaEmployee> findAllJpaEmployees() {
        return jpaEmployeeRepository.findAll();  // Find all from JPA
    }
}
