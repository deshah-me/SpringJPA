package com.example.JPA.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.id.factory.internal.AutoGenerationTypeStrategy;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Employee_Table")
public class Employee {

    @Id
    @Column(name = "employee_id")
//    @GeneratedValue(strategy = GenerationType.UUID)
   private int id;
    @Column(name = "employee_name")
    private String name;
    @Column(name = "employee_salary")
  private   int salary;


}
