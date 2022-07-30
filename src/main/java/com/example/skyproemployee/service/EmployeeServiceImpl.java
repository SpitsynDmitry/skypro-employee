package com.example.skyproemployee.service;

import com.example.skyproemployee.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employees = new ArrayList<>(List.of(
               new Employee("Petr", "Ivanov", 1),
               new Employee("Ivan", " Petrov", 2),
               new Employee(" Sergey", " Petrov2", 3),
               new Employee("Alexey", "Ivanjv", 4)

    ));

    public String getEmployee(Integer number) {
        final Employee employee;
          try {
        if(number >= employees.size()){
              return null;

       }
        employee = employees.get(number);

          }  catch (ArrayIndexOutOfBoundsException e){return "Попробуйте другой номер";}
        final String employeeDescription = ""
               + employee.getId() + " "
                + employee.getName();

    return employeeDescription;

   }
@Override
   public void addEmployee(Employee employee){
        employees.add(employee);
   }

    @Override
    public String getEmployeeName(String name) {
        return null;
    }


    @Override
    public String getEmployeeName(String name, String surname) {
        for (Employee employee : employees) {
            if(employee.getName().equals(name)&&employee.getSurname().equals(surname) ){

                final String personDescription = ""
                        + employee.getName() + " "
                        + employee.getSurname()
                        + " " + employee.getId();
                return personDescription;
            }

        }
        throw new RuntimeException("Человек с таким именем не найден");
    }


    public Employee removeEmployeeName(String name, String surname, int id) {
        Employee employee = new Employee( name,surname, id);
        for (int i = 0; i < employees.size(); i++) {
            if(employee.getName().equals(name)&&employee.getSurname().equals(surname) )
                employee = null;
                return employee;

            }
        throw new RuntimeException("Человек с таким именем не найден");
        }

    @Override
    public String findEmployeeName(String name, String surname) {
        for (Employee employee : employees) {
            if(employee.getName().equals(name)&&employee.getSurname().equals(surname) ){
                final String personDescription = ""
                        + employee.getName() + " "
                        + employee.getSurname()
                        + " " + employee.getId();
                return personDescription;
            }

        }
        throw new RuntimeException("Человек с таким именем не найден");
    }


}


