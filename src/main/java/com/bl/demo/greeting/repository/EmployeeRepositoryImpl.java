package com.bl.demo.greeting.repository;
import com.bl.demo.greeting.model.Employee;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> get() {
        Session currentSession=entityManager.unwrap(Session.class);
        Query<Employee> query=currentSession.createQuery("from Employee",Employee.class);
        List<Employee> list=query.getResultList();
        return list;
    }

    @Override
    public Employee get(int id) {
        Session currentSession=entityManager.unwrap(Session.class);
        Employee employee=currentSession.get(Employee.class,id);
        return employee;
    }

    @Override
    public void save(Employee employee) {
        Session currentSession=entityManager.unwrap(Session.class);
        currentSession.save(employee);
    }

    @Override
    public void delete(int id) {

    }
}
