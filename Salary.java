package edu.trials.salary;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
//		Write a Java program to input basic salary of an employee and calculate its Gross salary according to following:
//			Basic Salary <= 10000 : HRA = 20%, DA = 80%
//			Basic Salary <= 20000 : HRA = 25%, DA = 90%
//			Basic Salary > 20000 : HRA = 30%, DA = 95%
//			________________________________

		
		float basicSalary;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary: ");
		basicSalary = sc.nextFloat();
		
		float hra = 0.000f, da = 0.000f;
		
		if(basicSalary>0 &&basicSalary <=10000) {
			hra = basicSalary * 0.20f;
			da = basicSalary * 0.80f;
		}else if(basicSalary>10000 &&basicSalary <=20000) {
			hra = basicSalary * 0.25f;
			da = basicSalary * 0.90f;
		}else if(basicSalary>20000) {
			hra = basicSalary * 0.30f;
			da = basicSalary * 0.95f;
		}
		
		float grossSal = basicSalary + hra + da;
		System.out.println("Your gross salary is: " +grossSal );
		
	}

}
