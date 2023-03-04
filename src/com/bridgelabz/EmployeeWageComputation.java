package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("** Welcome to Employee Wage Computation Program **");

        Random random = new Random();
        int attendance = random.nextInt(3);
        int empWagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;
        int salaryPerDay;
        int salaryPartTime;

        System.out.println("Attendance = " + attendance);

        salaryPerDay = attendance * fullDayHour * empWagePerHour;
        salaryPartTime = partTimeHour * empWagePerHour;

        if (attendance == 1) {
            System.out.println("Employee Daily Wage = " + salaryPerDay);
        } else if (attendance == 2) {
            System.out.println("Employee Part-time Wage = " + salaryPartTime);
        } else {
            System.out.println("Employee Daily Wage = " + salaryPerDay);
        }
    }
}