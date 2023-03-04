package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("** Welcome to Employee Wage Computation Program **");

        Random random = new Random();
        int attendance = random.nextInt(2);
        int empWagePerHour = 20;
        int FullDayHour = 8;
        int salaryPerDay;
        System.out.println("Attendance = "+attendance);

        salaryPerDay = attendance*FullDayHour*empWagePerHour;
        if(attendance == 1){
            System.out.println("Employee Daily Wage = "+salaryPerDay);
        }else {
            System.out.println("Employee Daily Wage = "+salaryPerDay);
        }
    }
}