package com.naw.MokitoAndJunit5.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.naw.MokitoAndJunit5.service.model.Employee;


public class EmployeeService implements IEmployeeService {

	@Override
	public void createEmployee(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee fetchEmployeeById(Integer employeeId) {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setBonus(new BigDecimal(600));
		employee.setDoj(new Date());
		employee.setEmployeeName("KK");
		employee.setEmail("kk.cs2024@yahoo.com");
		employee.setSalary(50000.0);
		return employee;
	}

	@Override
	public void updateEmployeeEmailById(String newEmail, Integer employeeId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmployeeById(Integer employeeId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Employee> fetchAllEmployeesInfo() {
		List<Employee> employeeList = new ArrayList<Employee>();

		Employee employee = new Employee();
		employee.setId(1);
		employee.setBonus(new BigDecimal(600));
		employee.setDoj(new Date());
		employee.setEmployeeName("KK");
		employee.setEmail("kk.cs2024@yahoo.com");
		employee.setSalary(50000.0);
		employeeList.add(employee);
		employee = new Employee();
		employee.setId(2);
		employee.setBonus(new BigDecimal(700));
		employee.setDoj(new Date());
		employee.setEmployeeName("MM");
		employee.setEmail("mm.cs2024@yahoo.com");
		employee.setSalary(6000.0);
		employeeList.add(employee);
		employee = new Employee();
		employee.setId(3);
		employee.setBonus(new BigDecimal(8900));
		employee.setDoj(new Date());
		employee.setEmployeeName("HH");
		employee.setEmail("hh.cs2024@yahoo.com");
		employee.setSalary(8000.0);
		employeeList.add(employee);

		return employeeList;
	}

}
