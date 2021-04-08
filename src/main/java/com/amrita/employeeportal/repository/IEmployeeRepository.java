package com.amrita.employeeportal.repository;

import com.amrita.employeeportal.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer>
{
}