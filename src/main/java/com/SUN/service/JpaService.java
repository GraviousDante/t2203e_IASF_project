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
    private EmployeeRepository employeeRepository;

    @Autowired
    private JpaEmployeeRepository jpaEmployeeRepository;

    public void createEmployee(String firstName, String lastName, String department) {
        Employee employee = new Employee();
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    public List<JpaEmployee> findAllJpaEmployees() {
        return jpaEmployeeRepository.findAll();
    }
}
