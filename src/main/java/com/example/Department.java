package com.example;

import java.util.List;
import java.util.ArrayList;

public class Department {
    private String name;
    private List<Employee> employeeList;

    public Department(String name) {
        this.name=name;
        employeeList= new ArrayList<Employee> ();
    }

    public String getName() {
        return this.name;
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public List<Employee> getEmployees() {
        return employeeList;
    }

    // TODO: Implement methods to add an employee, remove an employee, and calculate the average salary for the department
}
