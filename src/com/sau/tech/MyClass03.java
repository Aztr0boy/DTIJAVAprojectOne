package com.sau.tech;

import java.util.Scanner;

public class MyClass03 {
    public static void main(String[] args) {
        String empName;
        double empSalary, tax10;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input Employee Name : ");
        empName = sc.next();
        System.out.print("Input Employee Salary : ");
        empSalary = sc.nextDouble();
        System.out.println("--------------------------------");
        tax10 = empSalary * 10 / 100 ;
        System.out.println("Tax pay : " + tax10 + " Baht");
        System.out.println("--------------------------------");
    }
}
