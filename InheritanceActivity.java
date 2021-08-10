package com.company;

public class InheritanceActivity {

    public static void main(String[] args) {
        Employee managerObj = new Manager(126534,"Peter","Chennai India",237844,65000);
        managerObj.calculateSalary();
        Employee traineeObj = new Trainee(29846,"Jack","Mumbai India",442085,45000);
        traineeObj.calculateSalary();
        managerObj.calculateTransportAllowance();
        traineeObj.calculateTransportAllowance();
    }

}
