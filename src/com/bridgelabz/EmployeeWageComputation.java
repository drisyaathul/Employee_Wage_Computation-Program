package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputation {

    static final int empWagePerHour = 20;
    static final int maxWorkingHours = 100;
    static final int workingDays = 20;
    public void ComputeEmployeeWage(String companyName, int empWagePerHour, int maxWorkingHours, int WorkingDays){
        System.out.println("Name of the Company : "+companyName);
        System.out.println("Employee Wage per Hour : "+empWagePerHour);
        System.out.println("Maximum Working Hours per Month : "+maxWorkingHours);
        System.out.println("Maximum Working Days per Month : "+WorkingDays);

        int salaryPerDay;
        int empHour = 0;
        int totalWorkingHours = 0;
        int totalWage = 0;

        Random random = new Random();
        for (int day = 1; day <= workingDays; day++) {
            int attendance = random.nextInt(3);
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
        System.out.println("-----------------------");
        System.out.println(companyName+ " Employee Total Wages for a month = "+totalWage);
        System.out.println("---------------------------------------------");

    }
    public static void main(String[] args) {
        System.out.println("** Welcome to Employee Wage Computation Program **");

        EmployeeWageComputation company = new EmployeeWageComputation();
        company.ComputeEmployeeWage("ABB",60,100,20);
        company.ComputeEmployeeWage("Prestige",50,100,24);
        company.ComputeEmployeeWage("L&T",45,120,24);

    }
}