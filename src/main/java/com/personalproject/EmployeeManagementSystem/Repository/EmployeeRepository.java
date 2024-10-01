package com.personalproject.EmployeeManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.personalproject.EmployeeManagementSystem.Model.*;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
    
}
