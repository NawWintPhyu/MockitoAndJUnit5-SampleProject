package com.naw.MokitoAndJunit5.service;

import org.mockito.Mockito;

import com.naw.MokitoAndJunit5.service.model.Employee;

public class SpyEmployeeServiceTest2 {
	public static void main(String[] args) {

		SpyEmployeeServiceTest2 spyEmployeeServiceTest2 = new SpyEmployeeServiceTest2();
		spyEmployeeServiceTest2.testFetchEmployeeById();

	}

	public void testFetchEmployeeById() {

		EmployeeService employeeService = Mockito.spy(EmployeeService.class);
		// EmployeeService employeeService = Mockito.mock(EmployeeService.class);
		System.out.println(employeeService.hashCode());
		Employee employee = employeeService.fetchEmployeeById(2);
		System.out.println(employee);

	}

}
