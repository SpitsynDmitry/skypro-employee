package com.example.skyproemployee.controller;

import com.example.skyproemployee.domain.Employee;
import com.example.skyproemployee.service.EmployeeService;
import com.example.skyproemployee.service.EmployeeServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeServiceImpl employeeService;

    public EmployeeController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/employee")
    public String getEmployeeName(@RequestParam("name") String name) {

 //     final String employee;
       return employeeService.getEmployeeName(name);

    }
    @GetMapping(path = "/employee/add")
    public String addEmployee(@RequestParam("name") String name,
                              @RequestParam("surname") String surname) {

        Employee employee = new Employee(
                name,
                surname);

        employeeService.addEmployee(employee);
        return "Employee added";
    }

    @GetMapping
    public List<Employee> getEmployees(){return employeeService.getEmployees();
    }
    @GetMapping(path = "/employee/surname")
    public String findEmployeeName(@RequestParam("surname") String surname) {


        return employeeService.getEmployeeName(surname);
    }
    @GetMapping(path = "/employee/surname")
    public String removeEmployeeName(@RequestParam("surname") String surname) {
        return employeeService.getEmployeeName(surname);
    }
}


