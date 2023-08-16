package com.example.JPA.repository;

import com.example.JPA.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
//    List<Employee> save(List<Employee> EmployeeList);
}
