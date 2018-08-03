package com.test.employeeCrud.service;

import java.util.List;

import com.test.employeeCrud.model.Employee;



public interface EmployeeService {

	List<Employee> getEmpDetails();	
	public Employee getEmployeeById(int id );
		 
	String deleteEmployee(int id); 
		 
	String updateEmp(Employee employee);
	
	String createEmployee(Employee employee);
}
