package com.bl.demo.greeting.service;
import com.bl.demo.greeting.model.Employee;
import com.bl.demo.greeting.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    @Override
    public List<Employee> get() {
        return employeeRepository.get();
    }

    @Transactional
    @Override
    public Employee get(int id) {
        return employeeRepository.get(id);
    }

    @Transactional
    @Override
    public Employee save(Employee employee) {
        employeeRepository.save(employee);

        return employee;
    }

    @Transactional
    @Override
    public void delete(int id) {

    }
}
