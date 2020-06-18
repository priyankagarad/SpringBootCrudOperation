package com.bl.demo.greeting.controller;
import com.bl.demo.greeting.model.Employee;
import com.bl.demo.greeting.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> get() {
        return employeeService.get();
    }

    @PostMapping("/employee")
    public Employee save(@RequestBody Employee employeeObj) {
        return employeeService.save(employeeObj);
    }

    @GetMapping("/employee/{id}")
    public Employee get(@PathVariable int id){
        return employeeService.get(id);
    }
}


