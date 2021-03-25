package com.amrita.employeeportal;

import com.amrita.employeeportal.controller.EmployeeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;


@SpringBootApplication
public class EmployeePortalApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EmployeePortalApplication.class, args);
		EmployeeController employeeController = (EmployeeController) context.getBean("employeeController");
		employeeController.setEmployees(new ArrayList<>());
	}

}
