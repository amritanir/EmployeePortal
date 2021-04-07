package com.amrita.employeeportal.api;

import com.amrita.employeeportal.model.Employee;
import java.util.List;

public interface IEmployeeService {

    void setEmployees(List<Employee> employees);

    List<Employee> getEmployees();

    void addEmployee(Employee employee);
}
