package com.learning;

public class Employee {

    public String name;
    public String department;
    public double salary;
    public String dob;
    public String phone;
    public String mobile;

    // Constructor
    public Employee(String name, String department, double salary,
             String dob, String phone, String mobile) {

        this.name = name;
        this.department = department;
        this.salary = salary;
        this.dob = dob;
        this.phone = phone;
        this.mobile = mobile;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", dob='" + dob + '\'' +
                ", phone='" + phone + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
