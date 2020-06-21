package com.bl.demo.controller;
import com.bl.demo.model.Employee;
import com.bl.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/empinformation")
    public List<Employee> get() {
        return employeeService.get();
    }

    @PostMapping("/addemployee")
    public Employee save(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }
}