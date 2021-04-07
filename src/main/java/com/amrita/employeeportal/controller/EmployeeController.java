package com.amrita.employeeportal.controller;

import com.amrita.employeeportal.api.IEmployeeService;
import com.amrita.employeeportal.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin
@RestController
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/employees")
    @ResponseBody
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @PostMapping("/employee")
    public void addEmployee(@RequestBody Employee employee)
    {
        employeeService.addEmployee(employee);
    }
}
