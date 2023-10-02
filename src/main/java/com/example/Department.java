package com.example;

import java.util.List;
import java.util.ArrayList;

public class Department {
    private String name;
    private List<Employee> employeeList;

    public Department(String name) {
        this.name=name;
        this.employeeList= new ArrayList <Employee> ();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }
    
    public List<Employee> getEmployees() {
        return employeeList;
    }

    public String getName(){
        return this.name;
    }

}
