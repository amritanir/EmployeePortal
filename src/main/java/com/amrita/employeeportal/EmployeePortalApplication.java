package com.amrita.employeeportal;

import com.amrita.employeeportal.api.IEmployeeService;
import com.amrita.employeeportal.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.*;


@SpringBootApplication
public class EmployeePortalApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EmployeePortalApplication.class, args);
		IEmployeeService employeeService = (IEmployeeService) context.getBean("employeeServiceImpl");

		// Populate table with initial data
		List<Employee> employees = new ArrayList<>();
		Employee emp1 = new Employee("Rodney",
				"Steven",
				"Male",
				new GregorianCalendar(1988, Calendar.AUGUST, 27).getTime(),
				"Information Technology");
		Employee emp2 = new Employee("Cynthia",
				"West",
				"Female",
				new GregorianCalendar(1994, Calendar.FEBRUARY, 11).getTime(),
				"Logistics");
		employees.add(emp1);
		employees.add(emp2);
		employeeService.setEmployees(employees);
	}

}
