package com.example.skyproemployee.domain;

import java.util.Objects;


public class Employee {
    private static int counter;
    private String name;
    private String surname;




    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public static int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public static void setCounter(int counter) {
        Employee.counter = counter;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name) && surname.equals(employee.surname);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
