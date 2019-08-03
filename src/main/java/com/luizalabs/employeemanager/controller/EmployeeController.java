package com.luizalabs.employeemanager.controller;

import com.luizalabs.employeemanager.controller.response.EmployeeResponse;
import com.luizalabs.employeemanager.models.Employee;
import com.luizalabs.employeemanager.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ModelAndView list() {

        List<Employee> employees = employeeService.list();

        List<EmployeeResponse> responseList = new ArrayList<>();

        employees.forEach(employee -> {
            EmployeeResponse response = new EmployeeResponse();

            response.setId(employee.getId());
            response.setName(employee.getName());
            response.setEmail(employee.getEmail());
            response.setDepartment(employee.getDepartment().getDescription());

            responseList.add(response);
        });

        ModelAndView mv = new ModelAndView("/employee");
        mv.addObject("employees", responseList);
        return mv;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable("id") Long id) {

        System.out.println(id);
        return list();
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") Long id) {

        System.out.println(id);

        return list();
    }

}
