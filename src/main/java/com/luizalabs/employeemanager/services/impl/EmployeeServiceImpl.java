package com.luizalabs.employeemanager.services.impl;

import com.luizalabs.employeemanager.models.Department;
import com.luizalabs.employeemanager.models.Employee;
import com.luizalabs.employeemanager.services.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Override
    public List<Employee> list() {
        Department department = new Department();
        department.setDescription("Vendas");

        Employee employee1 = new Employee();
        employee1.setId(1l);
        employee1.setName("José Silva");
        employee1.setEmail("jose.silva@pay2b.io");
        employee1.setDepartment(department);


        Employee employee2 = new Employee();
        employee2.setId(2l);
        employee2.setName("Maria do Rosario");
        employee2.setEmail("maria.rosario@pay2b.io");
        employee2.setDepartment(department);

        List<Employee> employees = new ArrayList<>();

        employees.add(employee1);
        employees.add(employee2);

        return employees;
    }
}
