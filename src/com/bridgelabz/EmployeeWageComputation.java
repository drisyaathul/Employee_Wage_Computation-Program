package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("** Welcome to Employee Wage Computation Program **");

        Random random = new Random();
        int attendance = random.nextInt(3);
        int empWagePerHour = 20;
        int salaryPerDay;
        int empHour = 0;
        int workingDays = 20;
        int empMonthlyWage;

        System.out.println("Attendance = " + attendance);

        switch (attendance) {
            case 0:
                empHour = 0;
                break;
            case 1:
                empHour = 8;
                break;
            case 2:
                empHour = 4;
                break;
        }
        salaryPerDay = empHour * empWagePerHour;
        System.out.println("Employee Salary per Day = " + salaryPerDay);
        empMonthlyWage = salaryPerDay * workingDays;
        System.out.println("Employee Monthly Wages = " + empMonthlyWage);
    }
}