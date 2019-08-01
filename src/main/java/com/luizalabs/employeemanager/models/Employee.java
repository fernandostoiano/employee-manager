package com.luizalabs.employeemanager.models;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee extends DomainModel<Employee> {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @OneToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}
