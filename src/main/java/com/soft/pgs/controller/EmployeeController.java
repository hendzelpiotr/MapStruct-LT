package com.soft.pgs.controller;

import com.soft.pgs.dto.EmployeeDTO;
import com.soft.pgs.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Piotr on 20.06.2017.
 */
@RestController
@RequestMapping("api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<EmployeeDTO>> getAll() {
        List<EmployeeDTO> allEmployees = employeeService.getAllEmployees();
        return ResponseEntity.ok(allEmployees);
    }

    @GetMapping("{id}")
    public ResponseEntity<EmployeeDTO> getOne(@PathVariable("id") Integer id) {
        EmployeeDTO employee = employeeService.getOne(id);
        return ResponseEntity.ok(employee);
    }

}
