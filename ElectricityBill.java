package edu.trials.salary;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
//		Write a Java program to input electricity unit charges and calculate total electricity bill according to the given condition:
//		For first 50 units Rs. 0.50/unit
//		For next 100 units Rs. 0.75/unit
//		For next 100 units Rs. 1.20/unit
//		For unit above 250 Rs. 1.50/unit
//		An additional surcharge of 20% is added to the bill
		
		int unit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter units used: ");
		unit = sc.nextInt();
		
		float eleBill = 0.000f;
		
		if(unit>0 && unit<=50) {
			eleBill = unit * 0.50f;
		}else if(unit>50 && unit<=150) {
			eleBill = (unit - 50)* 0.75f + 50*0.50f;
		}else if(unit>150 && unit<=250) {
			eleBill = (unit-150) * 1.20f + 100*1.20f + (50 *0.50f);
		}else if(unit>250) {
			eleBill = (unit-250) * 1.20f + (100*1.20f) + (100 *1.20f)+(50*0.50f);
		}
		
		float subCharges = eleBill * 0.20f; 
		
		eleBill = eleBill + subCharges;
		
		System.out.println("Elecrity bill with additional 20% subcharges is: "+ eleBill);
	}

}
