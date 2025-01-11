package com.personalproject.EmployeeManagementSystem.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import java.time.LocalDate;

@Entity
public class Employee {
    @Id
    private int employeeId;
    @NotBlank(message = "Employee must have a name")
    private String name;
    @Pattern(regexp = "^\\+?[0-9]{10,15}$", message = "Phone number must be valid")
    private String phoneNumber;
    @NotBlank(message = "Employee must have a department")
    private String department;
    @NotBlank(message = "Employee must have a salary")
    private double salary;
    private String address;

    //Constructors
    public Employee(int employeeId, String name, String phoneNumber, String department, double salary, String address){
        this.employeeId = employeeId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.salary = salary;
        this.address = address;
    }

    public Employee(int employeeId, String name, String phoneNumber, String department, double salary){
        this.employeeId = employeeId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.salary = salary;
    }

    public Employee(int employeeId, String name){
        this.employeeId = employeeId;
        this.name = name;
    }

    public Employee(String name){
        this.name = name;
    }



    //getters and setters
    public int getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
