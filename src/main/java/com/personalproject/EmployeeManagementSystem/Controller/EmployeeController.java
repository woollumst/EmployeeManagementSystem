package com.personalproject.EmployeeManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.personalproject.EmployeeManagementSystem.Service.EmployeeService;
import com.personalproject.EmployeeManagementSystem.Model.*;
import java.util.*;

@RestController
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    //endpoints
    @GetMapping("/")
	public @ResponseBody String greeting() {
		return employeeService.greeting();
	}
    
    @GetMapping("/Employee")
    public @ResponseBody List<Employee> getEmployees(){
        return employeeService.getAllEmployees();
    }
    
    @GetMapping("/Employee/{id}")
    public @ResponseBody Employee getEmployeeById(@PathVariable int employeeId){
        return employeeService.getEmployeeById(employeeId);
    }
}
