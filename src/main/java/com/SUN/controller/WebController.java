package com.SUN.controller;

import com.SUN.entity.Employee;
import com.SUN.entity.JpaEmployee;
import com.SUN.model.Employee;
import com.SUN.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public void createEmployee(@RequestBody EmployeeRequest employeeRequest) {
        employeeService.createEmployee(
                employeeRequest.getFirstName(),
                employeeRequest.getLastName(),
        );
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.findAll();
    }

    @GetMapping("/jpa")
    public List<JpaEmployee> getAllJpaEmployees() {
        return employeeService.findAll();
    }

    public static class EmployeeRequest {
        private String firstName;
        private String lastName;

    }
}
