package com.empwagepractiseproblem;

public class EmpWageaborpresent {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        double empcheck =  Math.floor(Math.random() * 10) %2;
        if(empcheck == 1){
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
    }
}
