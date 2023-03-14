package com.bridgelabz;

import java.util.Random;

public class CompanyEmpWage implements EmpWageBuilder {
    public int empWagePerHour = 20;
    public int maxWorkingHours = 100;
    public int workingDays = 20;

    CompanyEmpWage(int workingDays, int maxWorkingHours, int empWagePerHour) {

        this.workingDays = workingDays;
        this.maxWorkingHours = maxWorkingHours;
        this.empWagePerHour = empWagePerHour;
    }
    public int ComputeEmployeeWage() {   //method

        int salaryPerDay;
        int empHour = 0;
        int totalWorkingHours = 0;
        int totalWage = 0;

        Random random = new Random();
        for (int day = 1; day <= workingDays; day++) {
            int attendance = random.nextInt(3);
            switch (attendance) {
                case 0:
                    empHour = 0;
                    //System.out.println("Employee is absent");
                    break;
                case 1:
                    empHour = 8;
                    //System.out.println("Employee is Working Full-Day");
                    break;
                case 2:
                    empHour = 4;
                    //System.out.println("Employee is Working Half-Day");
                    break;
            }

            salaryPerDay = empHour * empWagePerHour;
            totalWorkingHours += maxWorkingHours;
            totalWage += salaryPerDay;
        }
        return totalWage;
    }
}


