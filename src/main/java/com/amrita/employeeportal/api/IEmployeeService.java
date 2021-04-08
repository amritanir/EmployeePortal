package com.amrita.employeeportal.api;

import com.amrita.employeeportal.model.Employee;

import java.util.List;

public interface IEmployeeService
{
    List<Employee> getEmployees();

    Employee getEmployee(int employeeId);

    Employee addEmployee(Employee emp);

    boolean updateEmployee(int employeeId, Employee emp);

    boolean deleteEmployee(int employeeId);
}