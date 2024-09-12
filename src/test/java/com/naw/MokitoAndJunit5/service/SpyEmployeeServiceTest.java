package com.naw.MokitoAndJunit5.service;

import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.naw.MokitoAndJunit5.service.model.Employee;

//@ExtendWith(value = { MockitoExtension.class })
public class SpyEmployeeServiceTest {

	// @Mock
	// private EmployeeService employeeService;// @Spy test by calling the actual
	// method

	@Test
	public void testFetchEmployeeById() {
		EmployeeService employeeService = Mockito.spy(EmployeeService.class);
		System.out.println(employeeService.hashCode());
		when(employeeService.fetchEmployeeById(90)).thenReturn(getEmployee());
		Employee employee = employeeService.fetchEmployeeById(90);
		System.out.println(employee);
	}

	private Employee getEmployee() {
		Employee employee = new Employee();
		employee.setBonus(new BigDecimal(600));
		employee.setDoj(new Date());
		employee.setEmployeeName("KK");
		employee.setEmail("kk.cs2024@yahoo.com");
		employee.setSalary(98000.0);
		return employee;
	}

}
