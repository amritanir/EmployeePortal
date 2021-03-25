package com.amrita.employeeportal.controller;

import com.amrita.employeeportal.model.Employee;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class EmployeeControllerTest {

    @Test
    @DisplayName("Should return the current employees in the list")
    void testGetEmployees() {
        EmployeeController employeeController = new EmployeeController();

        List<Employee> testEmployees = new ArrayList<>();
        Employee testEmployee = new Employee();
        testEmployee.setFirstName("Ramesh");
        testEmployee.setLastName("Pai");
        testEmployee.setDepartment("Finance");
        testEmployee.setGender("Male");
        testEmployee.setDateOfBirth(new Date());
        testEmployees.add(testEmployee);
        employeeController.setEmployees(testEmployees);

        List<Employee> employees = employeeController.getEmployees();

        assertThat(employees).isNotNull();
        assertThat(employees).hasSize(1);
        assertThat(employees).containsExactly(testEmployee);
    }

    @Test
    @DisplayName("After employees are added, the list should be sorted in ascending order by first name")
    void testAddEmployee()
    {
        EmployeeController employeeController = new EmployeeController();
        employeeController.setEmployees(new ArrayList<>());

        Employee testEmployee1 = new Employee();
        testEmployee1.setFirstName("Ramesh");
        testEmployee1.setLastName("Pai");
        testEmployee1.setDepartment("Finance");
        testEmployee1.setGender("Male");
        testEmployee1.setDateOfBirth(new Date());
        employeeController.addEmployee(testEmployee1);

        Employee testEmployee2 = new Employee();
        testEmployee2.setFirstName("Anshu");
        testEmployee2.setLastName("Gupta");
        testEmployee2.setDepartment("Information Technology");
        testEmployee2.setGender("Male");
        testEmployee2.setDateOfBirth(new Date());
        employeeController.addEmployee(testEmployee2);

        assertThat(employeeController.getEmployees()).isNotNull();
        assertThat(employeeController.getEmployees()).hasSize(2);
        assertThat(employeeController.getEmployees()).containsExactly(testEmployee2, testEmployee1);
    }
}
