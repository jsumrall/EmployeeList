package com.example.max.myapplication;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Employee {
    private static float startingSalary = 10000;
    public enum Currency {EUR, USD} //New
    Currency salaryCurrency = Currency.EUR; //New
    public static final NumberFormat euroFormatter = NumberFormat.getCurrencyInstance(Locale.GERMANY);
    public static final NumberFormat dollarFormatter = NumberFormat.getCurrencyInstance(Locale.US);
    private String firstName; //New
    private String middleName; //New
    private String lastName;
    private int yearBorn;
    float salary;

    public Employee(String firstName, String lastName, int yearBorn){ //New
        this.firstName = firstName; //New
        this.middleName = "";
        this.lastName = lastName; //New
        this.yearBorn = yearBorn; //New
        this.salary = Employee.startingSalary; //New, using static reference and not instance reference.
    }

    public String getFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    public int getYearBorn(){
        return yearBorn;
    }

    public float getSalary() {
        return salary;
    }

    public String getFormattedSalary(){
        String formattedSalary = "";
        switch (salaryCurrency) {
            case EUR:
                formattedSalary = euroFormatter.format(this.getSalary());
                break;
            case USD:
                formattedSalary = dollarFormatter.format(this.getSalary());
                break;
        }
        return formattedSalary;
    }

    public static List<Employee> getEmployees() {
        Employee employeeOne = new Employee("Jonathan", "Sumrall", 1991);
        Employee employeeTwo = new Employee("Ali", "Niknam", 2015);
        Employee employeeThree = new Employee("Barack", "Obama", 1961);
        List<Employee> employees = new ArrayList<>();
        employees.add(employeeOne);
        employees.add(employeeTwo);
        employees.add(employeeThree);

        return employees;
    }
}

