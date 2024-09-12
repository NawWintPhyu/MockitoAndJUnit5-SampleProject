package com.naw.MokitoAndJunit5.service;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.naw.MokitoAndJunit5.service.model.Employee;

@ExtendWith(value = { MockitoExtension.class })
@TestInstance(value = Lifecycle.PER_CLASS)
public class EmployeeServiceTest2 {
	@Mock
	private IEmployeeService iEmployeeService;

//	@BeforeAll
//	public void setUp() {
//		MockitoAnnotations.openMocks(this);
//	}

	@Test
	public void testFetchEmployeeById() {
		Employee employee = getEmployee();
		when(iEmployeeService.fetchEmployeeById(10)).thenReturn(employee);
		// System.out.println(iEmployeeService.fetchEmployeeById(11));
		assertEquals("KK", iEmployeeService.fetchEmployeeById(10).getEmployeeName());
		assertEquals(50000.0, iEmployeeService.fetchEmployeeById(10).getSalary());
		assertAll("testFetchEmployeeById",
				() -> assertEquals("KK", iEmployeeService.fetchEmployeeById(10).getEmployeeName()),
				() -> assertEquals(50000.0, iEmployeeService.fetchEmployeeById(10).getSalary()),
				() -> assertEquals("kk.cs2024@yahoo.com", iEmployeeService.fetchEmployeeById(10).getEmail()));

	}

	private Employee getEmployee() {
		Employee employee = new Employee();
		employee.setId(10);
		employee.setBonus(new BigDecimal(600));
		employee.setDoj(new Date());
		employee.setEmployeeName("KK");
		employee.setEmail("kk.cs2024@yahoo.com");
		employee.setSalary(50000.0);
		return employee;
	}
}
