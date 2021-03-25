package com.amrita.employeeportal;

import com.amrita.employeeportal.controller.EmployeeController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class EmployeePortalApplicationTest {

	@Autowired
	private EmployeeController controller;

	@Test
	@DisplayName("Controller should get initialized once context loads")
	void contextLoads() {
		assertThat(controller).isNotNull();
	}
}
