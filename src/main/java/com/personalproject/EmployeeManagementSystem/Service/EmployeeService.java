package com.personalproject.EmployeeManagementSystem.Service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.personalproject.EmployeeManagementSystem.Model.*;
import com.personalproject.EmployeeManagementSystem.Repository.EmployeeRepository;

@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    //Methods to call Repository
    public String greeting(){ //test
        return "Hello world!";
    }

    public List<Employee> getAllEmployees(){ //get employee list
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(int employee_id){ //fetch specific employee by id
        return employeeRepository.findById(employee_id).get();
    }

    public Employee getEmployeeByName(String firstName, String lastName){ //fetch employee by first+last name
        return employeeRepository.findByFirstNameAndLastName(firstName, lastName);
    }

    public Employee updateEmployeePhoneNumber(Employee selectedEmp, String phoneNumber){ //update employee phone num
        selectedEmp.setPhoneNumber(phoneNumber);
        return employeeRepository.save(selectedEmp);
    }

    public Employee updateEmployeeSalary(Employee selectedEmployee, int newSalary){
        selectedEmployee.setSalary(newSalary);
        return employeeRepository.save(selectedEmployee);
    }

    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
}
