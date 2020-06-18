package com.bl.demo.greeting.repository;
import com.bl.demo.greeting.model.Employee;
import java.util.List;

public interface EmployeeRepository {
    List<Employee> get();
    Employee get(int id);
    void save(Employee employee);
    void delete(int id);

}
