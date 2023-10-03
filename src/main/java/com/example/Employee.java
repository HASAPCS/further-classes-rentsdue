package com.example;

public class Employee {
    private String name;
    private int id;
    private double salary;
    private String department;

    public Employee(String name, int id, double salary, String department) {
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.department=department;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setName(String newname) {
        this.name=newname;
    }

    public void setSalary(double newsalary) {
        this.salary=newsalary;
    }

    public void setId(int newsalary) {
        this.salary=newsalary;
    }

    public void setDepartment(String newdepartment) {
        this.department=newdepartment;
    }
}
