package com.example.EmployeeMS.controller;

import com.example.EmployeeMS.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employee/")
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping("add")
    public ResponseEntity<?> addEmployee(@Valid @RequestBody )
}
