package com.personalproject.EmployeeManagementSystem;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.personalproject.EmployeeManagementSystem.Model.Employee;
import com.personalproject.EmployeeManagementSystem.Repository.EmployeeRepository;
import com.personalproject.EmployeeManagementSystem.Service.EmployeeService;

@SpringBootTest
class EmployeeManagementSystemApplicationTests {
	@Mock
	private EmployeeRepository employeeRepository;

	@InjectMocks
	private EmployeeService employeeService;

	@Test
	void contextLoads() {
	}

	@Test
	public void testGetEmployeeById_Success(){
		//mock repository to return an employee
		Employee mockEmployee = new Employee(1, "John", "Doe");
		when(employeeRepository.findById(1)).thenReturn(Optional.of(mockEmployee));

		//call service method
		Employee employee = employeeService.getEmployeeById(1);

		//Assert
		assertNotNull(employee);
		assertEquals(1, employee.getEmployeeId());
		assertEquals("John", employee.getFirstName());
	}

	/*
	//TODO: CREATE RESOURCE NOT FOUND EXCEPTION
	// Prob create exception folder
	@Test
	public void testGetEmployeeById_NotFound(){
		//mock repository : return empty optional
		when(employeeRepository.findById(1)).thenReturn(Optional.empty());

		//Verify service throws correct exception
		Exception exception = assertThrows(ResourceNotFoundException.class, () -> {
			employeeService.getEmployeeById(1);
		});

		assertEquals("Employee not found", exception.getMessage());
	} */

	@Test
	public void testSaveEmployee(){
		//create mock employee
		Employee newEmployee = new Employee("Jane", "Doe");
		Employee savedEmployee = new Employee(1, "Jane", "Doe");

		//mock repository save method
		when(employeeRepository.save(newEmployee)).thenReturn(savedEmployee);

		//call service method
		Employee result = employeeService.createEmployee(newEmployee);

		//assertions
		assertNotNull(result);
		assertEquals(1, result.getEmployeeId());
		assertEquals("Jane", result.getFirstName());
	}
}
