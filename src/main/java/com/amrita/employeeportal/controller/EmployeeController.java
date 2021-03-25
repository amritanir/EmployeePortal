package com.amrita.employeeportal.controller;

import com.amrita.employeeportal.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin
@RestController
public class EmployeeController {

    private List<Employee> employees;

    @Autowired
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @GetMapping("/employees")
    @ResponseBody
    public List<Employee> getEmployees() {
        return employees;
    }

    @PostMapping("/employee")
    public void addEmployee(@RequestBody Employee employee)
    {
        employees.add(employee);
        Collections.sort(employees);
    }
}
