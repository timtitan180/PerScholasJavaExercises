package com.company;

import org.w3c.dom.NameList;

public class Employee extends Class {
    long employeeId;
    String Name;
    String employeeAddress;
    long phone;
    double basicSalary;
    double specialAllowance;
    double hra;

    Employee() {
    }
    Employee(int id, String name, String address, long phone) {
        this.id = employeeId;
        this.name = Name;
        this.address = employeeAddress;
        this.phone = phone;
    }


    public void calculateSalary() {
        double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
        System.out.println(salary);
    }

    public void calculateTransportAllowance() {
        double transportAllowance = 10/100 * basicSalary;
        System.out.println(transportAllowance);

    }



}
