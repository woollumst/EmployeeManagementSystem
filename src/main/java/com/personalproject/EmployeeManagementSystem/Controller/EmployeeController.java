package com.personalproject.EmployeeManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.personalproject.EmployeeManagementSystem.Service.EmployeeService;
import com.personalproject.EmployeeManagementSystem.Model.*;
import java.util.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    //endpoints
    @GetMapping("/") //test
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

    @PostMapping("/Employee")
    public @ResponseBody Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }
    
    @PutMapping("Employee/{id}")
    public @ResponseBody Employee updateEmployee(@PathVariable int employeeId, @RequestBody Employee employee) {
        employee.setEmployeeId(employeeId);
        return employeeService.updateEmployee(employee);
    }
}