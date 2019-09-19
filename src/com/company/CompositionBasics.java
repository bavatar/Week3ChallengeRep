package com.company;

import java.util.Scanner;

public class CompositionBasics {

    public static void main(String[] args) {
        Person luke = new Person();
        System.out.println(luke.getSalary());

        Scanner sc = new Scanner(System.in);
        System.out.println("What is the salary?");
        long salary = sc.nextLong();
        luke.getJob().setSalary(salary);
        System.out.println("Luke's New salary: " + luke.getSalary());
        System.out.println(luke.toString());

//        Person tom = new Person(salary);
//        System.out.println(tom.getSalary());
//        System.out.println(tom.toString());

//        Person jake = new Person();
//        System.out.println(jake.getSalary());
//        System.out.println(jake.toString());
    }
}
