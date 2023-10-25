package edu.trials.profitloss;

import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// input sp and cp
		float sp , cp;
		float profit=0.00f, loss = 0.00f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter cost price of product: ");
		cp = sc.nextFloat();
		System.out.println("Enter selling price of product");
		sp = sc.nextFloat();
		
		if(sp > cp) {
			profit = sp - cp;
			System.out.println("You made profit of: "+profit+" Rupees");
		}else {
			loss = cp - sp;
			System.out.println("You made loss of: "+loss+" Rupees");

		}

	}

}
