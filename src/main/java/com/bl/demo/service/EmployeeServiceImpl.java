package com.bl.demo.service;
import com.bl.demo.model.Employee;
import com.bl.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> get() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee save(Employee employee) {
        Employee employee1=new Employee(employee);
        return employeeRepository.save(employee1);
    }

    @Override
    public void delete(Integer id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee update(Integer id, Employee employee) {
        Employee employee1= employeeRepository.findById(id).get();
        String name= employee.getName();
        String city= employee.getCity();
        employee1.setCity(city);
        employee1.setName(name);
        return employeeRepository.save(employee1);
    }
}
