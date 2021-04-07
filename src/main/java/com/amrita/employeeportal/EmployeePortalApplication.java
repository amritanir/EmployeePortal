package com.amrita.employeeportal;

import com.amrita.employeeportal.api.IEmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;


@SpringBootApplication
public class EmployeePortalApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EmployeePortalApplication.class, args);
		IEmployeeService employeeService = (IEmployeeService) context.getBean("employeeServiceImpl");
		employeeService.setEmployees(new ArrayList<>());
	}

}
