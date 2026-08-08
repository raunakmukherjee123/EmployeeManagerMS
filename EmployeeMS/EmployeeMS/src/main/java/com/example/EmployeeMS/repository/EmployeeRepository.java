package com.example.EmployeeMS.repository;

import com.example.EmployeeMS.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
