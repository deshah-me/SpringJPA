package com.example.JPA.service;

import com.example.JPA.entities.Employee;
import com.example.JPA.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(EmployeeService.class);

    @Autowired
    private EmployeeRepository EmployeeRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"Deepak",1000));
        employeeList.add(new Employee(2,"Chanchal",5000));
        employeeList.add(new Employee(3,"Chandan",3000));

        for (Employee Employee : employeeList) {
            logger.info("Employee: id={}, name={}, balance={}", Employee.getId(), Employee.getName(), Employee.getSalary());
        }

        EmployeeRepository.saveAll(employeeList);
    }

    // CRUD Methods
    public Employee saveEmployee(Employee employee) {
        return EmployeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return EmployeeRepository.findAll();
    }

    public Employee getEmployeeById(int id) {
        Optional<Employee> employee = EmployeeRepository.findById(id);
        return employee.orElse(null);
    }

    public void deleteEmployee(int id) {
        EmployeeRepository.deleteById(id);
    }
}
