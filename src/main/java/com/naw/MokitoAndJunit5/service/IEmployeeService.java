package com.naw.MokitoAndJunit5.service;

import java.util.List;

import com.naw.MokitoAndJunit5.service.model.Employee;


public interface IEmployeeService {

	public void createEmployee(Employee employee);

	public Employee fetchEmployeeById(Integer employeeId);

	public void updateEmployeeEmailById(String newEmail, Integer employeeId);

	public void deleteEmployeeById(Integer employeeId);

	public List<Employee> fetchAllEmployeesInfo();

}
