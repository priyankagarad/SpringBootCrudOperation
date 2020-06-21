package com.bl.demo.service;
import com.bl.demo.model.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee> get();
    Employee save (Employee employee);
    void delete(Integer id);
    Employee update(Integer id, Employee employee);
}