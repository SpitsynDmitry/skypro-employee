package com.example.skyproemployee.service;

import com.example.skyproemployee.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employees = new ArrayList<>(List.of(
               new Employee("Petr", "Ivanov"),
               new Employee("Ivan", " Petrov"),
               new Employee(" Sergey", " Petrov2"),
               new Employee("Alexey", "Ivanjv")

    ));

    public String getEmployee(Integer number) {
        final Employee employee;
          try {
        if(number >= employees.size()){
              return null;

       }
        employee = employees.get(number);

          }  catch (ArrayIndexOutOfBoundsException e){return "Список переполнен";}
        final String employeeDescription = ""
               + employee.getName() + " "
                + employee.getSurname();

    return employeeDescription;

   }
@Override
   public void addEmployee(Employee employee){
        employees.add(employee);
   }

    @Override
    public String getEmployeeName(String name) {return null;}


    @Override
    public String getEmployeeName(String name, String surname) {
        Employee employee = new Employee( name,surname);
        for (int i = 0; i < employees.size(); i++) {
            if(employee.getName().equals(name)&&employee.getSurname().equals(surname) ){

                final String employeeDescription = ""
                        + employee.getName() + " "
                        + employee.getSurname();
                return employeeDescription;
            }

        }
        throw new RuntimeException("Человек с таким именем не найден");
    }

@Override
    public Employee removeEmployeeName(String name, String surname) {
        Employee employee = new Employee( name,surname);
        for (int i = 0; i < employees.size(); i++) {
            if(employee.getName().equals(name)&&employee.getSurname().equals(surname) )
                employee = null;
                return employee;

            }
        throw new RuntimeException("Человек с таким именем не найден");
        }

    @Override
    public String findEmployeeName(String surname) {
        for (Employee employee : employees) {
            if(employee.getSurname().equals(surname) ){
                final String employeeDescription = ""
                        + employee.getName() + " "
                        + employee.getSurname();
                return employeeDescription;
            }

        }
        throw new RuntimeException("Человек с таким именем не найден");
    }
    public List<Employee> getEmployees() {
        return employees;
    }
}


