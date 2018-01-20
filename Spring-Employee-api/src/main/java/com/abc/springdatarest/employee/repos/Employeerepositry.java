package com.abc.springdatarest.employee.repos;

import org.springframework.data.repository.CrudRepository;

import com.abc.springdatarest.employee.entities.Employee;

public interface Employeerepositry extends CrudRepository<Employee,Long> 
{
	
	
	

}
