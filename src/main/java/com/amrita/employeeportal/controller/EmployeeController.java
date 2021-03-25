package com.amrita.employeeportal.controller;

import com.amrita.employeeportal.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin
@RestController
public class EmployeeController {

    private List<Employee> employees= new ArrayList<>();

    @GetMapping("/employees")
    @ResponseBody
    public List<Employee> getEmployee() {
        return employees;
    }

    @PostMapping("/employee")
    public void addEmployee(@RequestBody Employee employee)
    {
        employees.add(employee);
        Collections.sort(employees);
    }
}
