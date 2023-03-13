package com.bridgelabz;

public class EmployeeWageComputation {
    public static CompanyEmpWage objectArray[] =new CompanyEmpWage[3];
    public static void main(String[] args) {
        objectArray[0] = new CompanyEmpWage(20, 100, 60);
        int employeeWageABB = objectArray[0].ComputeEmployeeWage();        //method calling
        System.out.println("Monthly employee wage at ABB = " + employeeWageABB);
        objectArray[1] = new CompanyEmpWage(24, 100, 50);
        int employeeWagePrestige = objectArray[1].ComputeEmployeeWage();      //method calling
        System.out.println("Monthly employee wage at Prestige = " + employeeWagePrestige);
        objectArray[2] = new CompanyEmpWage(25, 110, 45);
        int employeeWageTCS = objectArray[2].ComputeEmployeeWage();        //method calling
        System.out.println("Monthly employee wage at TCS = " + employeeWageTCS);

    }
}