package com.bl.demo.greeting.service;
import com.bl.demo.greeting.model.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee> get();
    Employee get(int id);
    Employee save(Employee employee);
    void delete(int id);

}
