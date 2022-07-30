package com.example.skyproemployee.controller;

import com.example.skyproemployee.domain.Employee;
import com.example.skyproemployee.service.EmployeeService;
import com.example.skyproemployee.service.EmployeeServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private final EmployeeServiceImpl employeeService;

    public EmployeeController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/employee")
    public String getEmployeeInfo(@RequestParam("number") Integer number) {

        final String employee;
        employee = employeeService.getEmployee(number);

        return employee;
    }

    @GetMapping(path = "/employee/add")
    public String addEmployee(@RequestParam("name") String name,
                              @RequestParam("surname") String surname,
                              @RequestParam("id") Integer id) {

        Employee employee = new Employee(
                name,
                surname,
                id);

        employeeService.addEmployee(employee);
        return "Employee added";
    }
}

