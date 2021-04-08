package com.amrita.employeeportal.api;

import com.amrita.employeeportal.model.Employee;
import com.amrita.employeeportal.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployees() {
        List<Employee>  employees = employeeRepository.findAll();
        Collections.sort(employees);
        return employees;
    }

    @Override
    public Employee getEmployee(int employeeId) {
        return employeeRepository.findById(employeeId).orElse(null);
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public boolean updateEmployee(int employeeId, Employee newEmployeeDetails) {
        Employee employee = employeeRepository.findById(employeeId).orElse(null);

        if (employee != null) {
            employee.setDepartment(newEmployeeDetails.getDepartment());
            employee.setDateOfBirth(newEmployeeDetails.getDateOfBirth());
            employee.setGender(newEmployeeDetails.getGender());
            employee.setLastName(newEmployeeDetails.getLastName());
            employee.setFirstName(newEmployeeDetails.getFirstName());
            employeeRepository.save(employee);
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean deleteEmployee(int employeeId) {
        Employee employee = employeeRepository.findById(employeeId).orElse(null);

        if (employee != null) {
            employeeRepository.delete(employee);
            return true;
        }
        else {
            return false;
        }
    }
}
