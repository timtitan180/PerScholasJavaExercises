package com.company;

import java.util.*;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
class Class {



    public static void main(String[] args) {



                // TODO Auto-generated method stub
                // Set is a collection with no Duplicate Elements or Every element of set must be unique.

                // set is interface. we can not create object. we give implementation by HashSet, TreeSet and other

                Set<Integer> setint = new HashSet<>();
                Set<String> setSt = new  HashSet<>();

                Set<Integer> tsetint = new TreeSet<>();
                Set<String> tsetSt = new TreeSet<>();
                setint.add(500);
                setint.add(100);
                setint.add(2);
                setint.add(3);
                setint.add(1);

                System.out.println(setint);

                Set<Integer> set2 = new HashSet<>();
                set2.add(3);
                set2.add(4);
                set2.add(5);
                // Union of two Set
                set2.addAll(setint);
                System.out.println(set2);

                // HashSet and TreeSet duplicate value not allow
                // Hashset does not maintain any order  but order is base on  hashing algorithm
                // Treeset by default Values store in ASC Order

                // Hashset allow null value
                // Treeset not allow null Value

                HashSet<String> Hst = new HashSet<>();
                HashSet<Integer> Hint = new HashSet<>();
                HashSet<Double> Hdob = new HashSet<>();
                HashSet hashsetObj = new HashSet<>();
                hashsetObj.add(100);
                hashsetObj.add(200);


                Hst.add("USA");
                Hst.add("UK");
                Hst.add("Australia");
                Hst.add("UAE");
                Hst.add("UAE");
                Hst.add(null);
                System.out.println(Hst);
                System.out.println("USA is " + Hst.contains("USA"));
                Hst.remove("UK");
                System.out.println("After remove");
                System.out.println(Hst);
                //  TreeSet
                TreeSet<String> tst = new TreeSet<>();
                TreeSet<Integer> tst1 = new TreeSet<>();
                TreeSet<Double> tst2 = new TreeSet<>();
                // TreeSet<Employee> tEmo = new TreeSet<>();
                tst.add("usa");
                tst.add("uk");
                tst.add("Canada");
                tst.add("uae");
                //tst.add(null); // add null value to treeset
                System.out.println(tst);
                System.out.println(tst.first());
            }
        }
//            System.out.print("Welcome to this Banking Application.\nTo Get Started follow the instructions below");
//            System.out.print("Enter your name:");
//            String name = inputs.nextLine();
//            Subclass account = new Subclass();
//            account.setName(name);
//            System.out.print("Enter your account number:");
//            long accountNumber = inputs.nextLong();
//            account.setAccountNumber(accountNumber);
//            System.out.println(accountNumber);
//            System.out.print("Enter your account type (Checking,Savings,Privileged or a Credit Card account");
//            String accountType = inputs.nextLine();
//            account.setAccountType(accountType);
//            System.out.println(accountType);
//            System.out.print("Enter your account's initial balance:");
//            double balance = inputs.nextDouble();







//    void setAccountNumber(long accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    long getAccountNumber() {
//        return accountNumber;
//    }
//    void setAccountNumber(long accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    long getAccountNumber() {
//        return accountNumber;
//    }

