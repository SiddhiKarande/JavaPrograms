package edu.trials.calculations;

import java.util.Scanner;

public class ValidByAngles {

	public static void main(String[] args) {
		//input data
		float ang1, ang2,ang3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first angle of triangle");
		ang1 = sc.nextFloat();
		System.out.println("Enter second angle of triangle");
		ang2 = sc.nextFloat();
		System.out.println("Enter third angle of triangle");
		ang3 = sc.nextFloat();
		
		if(ang1+ ang2+ang3 == 180) {
			System.out.println("It is valid triangle");
		}else {
			System.out.println("It is not valid triangle");
		}
	}

}
