package com.example.EmployeeMS.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
public class Employee extends BaseEntity{

  @Column(nullable = false)
  private String name;

  @Column(unique = true)
    private String email;

  private String department;

  private int age;

  private int salary;

  @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "address_id",referencedColumnName = "id")
  private Address address;
}
