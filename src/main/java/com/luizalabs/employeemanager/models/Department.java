package com.luizalabs.employeemanager.models;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "department")
public class Department extends DomainModel<Department> {

    @Column(nullable = false)
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
