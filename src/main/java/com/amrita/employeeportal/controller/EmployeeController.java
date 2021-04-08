package com.amrita.employeeportal.controller;

import com.amrita.employeeportal.api.IEmployeeService;
import com.amrita.employeeportal.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    public EmployeeController(){
    }

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable(value = "id") int employeeId) {
        return employeeService.getEmployee(employeeId);
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee)
    {
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/employees/{id}")
    public boolean updateEmployee(@PathVariable(value = "id") int employeeId, @RequestBody Employee employeeDetails) {
        return employeeService.updateEmployee(employeeId, employeeDetails);
    }

    @DeleteMapping("/employees/{id}")
    public boolean deleteEmployee(@PathVariable(value = "id") int employeeId) {
        return employeeService.deleteEmployee(employeeId);
    }
}
