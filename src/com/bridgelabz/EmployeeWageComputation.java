package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputation {
    static final int empWagePerHour = 20;
    static final int maxWorkingHours = 100;
    static final int maxWorkingDays = 20;
    public static void main(String[] args) {
        System.out.println("** Welcome to Employee Wage Computation Program **");

        Random random = new Random();

        int salaryPerDay;
        int empHour = 0;
        int workingDays = 20;
        int totalWorkingHours = 0;
        int totalWage = 0;

        for (int day = 1; day <= workingDays; day++) {
            int attendance = random.nextInt(3);
            //System.out.println("Attendance = " + attendance);
            System.out.println();

            switch (attendance) {
                case 0:
                    empHour = 0;
                    System.out.println("Employee is absent");
                    break;
                case 1:
                    empHour = 8;
                    System.out.println("Employee is Working Full-Day");
                    break;
                case 2:
                    empHour = 4;
                    System.out.println("Employee is Working Half-Day");
                    break;
            }
            salaryPerDay = empHour * empWagePerHour;
            totalWorkingHours += maxWorkingHours;
            totalWage += salaryPerDay;
            System.out.println("Day:"+day);
            System.out.println("Work Hours:"+empHour);
            System.out.println("Daily Wage = "+salaryPerDay);
        }
        System.out.println("---------------------------------------------");
        System.out.println("Employee Total Wages for a month = "+totalWage);

    }
}