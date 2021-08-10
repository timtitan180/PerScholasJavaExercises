package com.company;

public class Manager extends Employee{

    Manager(int id,String Name,String address,long phoneNumber, double salary) {
        this.id = super.employeeId;
        this.Name = super.Name;
        this.address = super.address;
        this.phoneNumber = super.phone;
        this.salary = super.basicSalary;
    }

    @Override
    public void calculateTransportAllowance() {
        double transportAllowance = 15*basicSalary/100;
        System.out.println(transportAllowance);
    }
}
