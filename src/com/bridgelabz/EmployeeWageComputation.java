package com.bridgelabz;

import java.util.ArrayList;

public class EmployeeWageComputation {
   // public static CompanyEmpWage objectArray[] =new CompanyEmpWage[3];
    public static ArrayList<CompanyEmpWage> companyEmpWages = new ArrayList<CompanyEmpWage>();
    public static void main(String[] args) {

        companyEmpWages.add(new CompanyEmpWage(20, 100, 60));
        int employeeWageABB=companyEmpWages.get(0).ComputeEmployeeWage();//method calling
        System.out.println("Monthly Employee Wage At ABB : "+employeeWageABB);
        companyEmpWages.add(new CompanyEmpWage(24,100,50));
        int employeeWagePrestige = companyEmpWages.get(1).ComputeEmployeeWage();//method calling
        System.out.println("Monthly Employee Wage At Prestige : "+employeeWagePrestige);
        companyEmpWages.add(new CompanyEmpWage(25,110,45));
        int employeeWageTCS = companyEmpWages.get(1).ComputeEmployeeWage();//method calling
        System.out.println("Monthly Employee Wage At TCS : "+employeeWageTCS);

    }
}