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
 //           throw new BadPersonNumberException( "Ошибка в том . что номер человека заведомо больше размера массива");
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




//@Service
//public class PersonServiceImpl implements PersonService1{
//    List<Person> persons = new ArrayList<>(List.of(
//            new Person("Жан", "Рено", "1121", 2),
//            new Person("Люк", "Бессон", "1122", 3),
//            new Person("Жерар", "Департье", "1123", 0),
//
//
//
//    ));
//
//    List <String> professions = List.of(
//            " Безработный",
//            " Водитель ",
//            " Плотник ",
//            " Столяр "
//
//    );
//@Override
//    public String getPerson(Integer number) {
//        final Person person;
//        //   try {
//        if(number >= persons.size()){
//            //  return null;
//            throw new BadPersonNumberException( "Ошибка в том . что номер человека заведомо больше размера массива");
//        }
//        person = persons.get(number);
//
//        //  }  catch (ArrayIndexOutOfBoundsException e){return "Попробуйте другой номер";}
//        final String personDescription = ""
//                + person.getName() + " "
//                + person.getSurname()
//                + " " + person.getPassport()
//              + " " + person.getProfessionNumber();
//    return personDescription;
//
//    }
//@Override
//    public void addPerson(Person person){
//        persons.add(person);
//    }
//
//}
//System.out.println("Курсовая Работа");
//
//        List list = new List();
//        System.out.println("Установить отдел и з.п");
//        list.setSalaryEmployee(2,"Ivan Ivanov 2",40000);
//
//        list.addEmployee(1, "Ivan Petrov", 500);
//        list.addEmployee(2, "Ivan Petrov 1", 200000);
//        list.addEmployee(3, "Ivan Petrov 2", 2000);
//        list.addEmployee(4, "Ivan Petrov 3", 800);
//        list.addEmployee(5, "Ivan Petrov 4", 50000);
//        list.addEmployee(1, "Ivan Ivanov", 10000);
//        list.addEmployee(2, "Ivan Ivanov 1", 10);
//        list.addEmployee(3, "Ivan Ivanov 2", 100);
//        list.addEmployee(4, "Ivan Ivanov 3", 40000);
//
//
//        System.out.println(" Все сотрудники");
//        list.printAllEmployees();
//        System.out.println();
//        System.out.println("Количество сотрудников: " + list.getCurrentSize1());
//
//        System.out.println("Метод toString  " + list);
//        System.out.println("Минимальная з.п.");
//        list.minSalaryEmployee();
//        System.out.println("Максимальная  з.п.");
//        list.maxSalaryEmployee();
//
//        System.out.println("Сумма з.п.");
//        list.sumSalaryEmployee();
//
//        System.out.println("Средняяя з.п.");
//        list.averageSumSalaryEmployee();
//
//
//        System.out.println("Удаленный сотрудник");
//        list.removeEmployee("Ivan Ivanov 3");
//        System.out.println("Поиск сотрудника");
//        list.findEmployee("Ivan Ivanov 2");
//
//        System.out.println("Установить отдел и з.п");
//        list.setSalaryEmployee(2,"Ivan Ivanov",40000);
//        list.printAllEmployees();
//
//        System.out.println("Индексация определенному сотруднику  з.п");
//        list.getIndexSalary(20,"Ivan Ivanov 2");
//        System.out.println("Индексация всем сотрудникам  з.п  на 20%");
//        list.IndexSalary(20);
//    }
//}