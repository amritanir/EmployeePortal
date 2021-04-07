package com.amrita.employeeportal.api;

import com.amrita.employeeportal.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    private List<Employee> employees;

    @Autowired
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
        Collections.sort(employees);
    }
}
