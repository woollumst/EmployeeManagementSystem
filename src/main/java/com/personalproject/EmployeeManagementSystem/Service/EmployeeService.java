package com.personalproject.EmployeeManagementSystem.Service;

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
}
