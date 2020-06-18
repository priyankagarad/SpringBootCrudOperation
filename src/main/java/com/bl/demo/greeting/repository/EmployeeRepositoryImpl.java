package com.bl.demo.greeting.repository;

import com.bl.demo.greeting.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{
    @Override
    public List<Employee> get() {
        return null;
    }

    @Override
    public Employee get(int id) {
        return null;
    }

    @Override
    public void save(Employee employee) {

    }

    @Override
    public void delete(int id) {

    }
}
