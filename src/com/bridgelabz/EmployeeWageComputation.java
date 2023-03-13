package com.bridgelabz;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        EmpWageBuilder ABB = new EmpWageBuilder(20, 100, 60);
        int employeeWageABB = ABB.ComputeEmployeeWage();        //method calling
        System.out.println("Monthly employee wage at ABB = " + employeeWageABB);
        EmpWageBuilder prestige = new EmpWageBuilder(24, 100, 50);
        int employeeWagePrestige = prestige.ComputeEmployeeWage();      //method calling
        System.out.println("Monthly employee wage at Prestige = " + employeeWagePrestige);
        EmpWageBuilder tcs = new EmpWageBuilder(25, 110, 45);
        int employeeWageTCS = tcs.ComputeEmployeeWage();        //method calling
        System.out.println("Monthly employee wage at TCS = " + employeeWageTCS);

    }
}