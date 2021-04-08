package com.amrita.employeeportal.api;

import com.amrita.employeeportal.model.Employee;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class EmployeeServiceImplTest {

    @Autowired
    private IEmployeeService employeeService;

    @Test
    @Order(1)
    @DisplayName("Should return the current employees in the list")
    void testGetEmployees() {

        Employee testEmployee = new Employee();
        testEmployee.setFirstName("Ramesh");
        testEmployee.setLastName("Pai");
        testEmployee.setDepartment("Finance");
        testEmployee.setGender("Male");
        testEmployee.setDateOfBirth(null);
        Employee returnValue = employeeService.addEmployee(testEmployee);

        List<Employee> employees = employeeService.getEmployees();

        assertThat(employees).isNotNull();
        assertThat(employees).hasSize(1);
        assertThat(employees.get(0).getId()).isEqualTo(returnValue.getId());
    }

    @Test
    @Order(2)
    @DisplayName("After employees are added, the list should be sorted in ascending order by first name")
    void testAddEmployee() {

        Employee testEmployee = new Employee();
        testEmployee.setFirstName("Anshu");
        testEmployee.setLastName("Gupta");
        testEmployee.setDepartment("Information Technology");
        testEmployee.setGender("Male");
        testEmployee.setDateOfBirth(null);
        employeeService.addEmployee(testEmployee);

        List<Employee> employees = employeeService.getEmployees();

        assertThat(employees).isNotNull();
        assertThat(employees).hasSize(2);
        assertThat(employees).isSorted();
    }
}
