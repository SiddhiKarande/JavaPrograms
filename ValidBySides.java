package edu.trials.calculations;

import java.util.Scanner;

public class ValidBySides {

	public static void main(String[] args) {
		// input sides 
		float side1, side2, side3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first side of triangle: ");
		side1 = sc.nextFloat();
		System.out.println("Enter second side of triangle: ");
		side2 = sc.nextFloat();
		System.out.println("Enter third side of triangle: ");
		side3 = sc.nextFloat();
		
		if(side1+side2>side3 || side1+side3> side2 || side2+side3>side1) {
			System.out.println("It is valid triangle");
		}else {
			System.out.println("It is not valid triangle");
		}

	}

}
