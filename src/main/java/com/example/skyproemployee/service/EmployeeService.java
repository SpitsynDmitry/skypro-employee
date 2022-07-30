package com.example.skyproemployee.service;

import com.example.skyproemployee.domain.Employee;


public interface EmployeeService {


        void addEmployee(Employee employee);


        String getEmployeeName(String name);

        String getEmployeeName(String name, String surname);

        String findEmployeeName(String name, String surname);
}
