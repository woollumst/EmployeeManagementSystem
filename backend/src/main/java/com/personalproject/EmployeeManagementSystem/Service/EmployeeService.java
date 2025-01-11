package com.personalproject.EmployeeManagementSystem.Service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.personalproject.EmployeeManagementSystem.Model.*;
import com.personalproject.EmployeeManagementSystem.Repository.EmployeeRepository;
import com.personalproject.Exceptions.ResourceNotFoundException;

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
        return employeeRepository.findById(employee_id).orElseThrow(() -> new ResourceNotFoundException("Employee not found"));
    }

    public Employee getEmployeeByName(String name){ //fetch employee by name
        return employeeRepository.findByName(name);
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

    public Employee patchEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee deleteEmployee(int employeeId){
        Employee delEmployee = getEmployeeById(employeeId);
        employeeRepository.deleteById(employeeId);
        return delEmployee;
    }
}
