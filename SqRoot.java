package edu.trials.sqroot;

import java.util.Scanner;

public class SqRoot {

	public static void main(String[] args) {
		
		System.out.println("Enter values of a ,b ,c for equation(ax^2 + bx + c)");
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for a: ");
		a= sc.nextInt();
		System.out.println("Enter value for b: ");
		b= sc.nextInt();
		System.out.println("Enter value for c: ");
		c= sc.nextInt();
		
		//double root;
		
		double d = (b*b)-4*a*c;
		if(d >0) {
			System.out.println("Roots are real and different");
			//x = (-b ± √ positive number )/2a
			System.out.println("Roots are :"+(-b + Math.sqrt(d))/2*a + " and "+(-b -Math.sqrt(d))/2*a);
		}else if(d==0) {
			System.out.println("Equation has single real root");
			System.out.println("Root is :"+ (-b/2*a));
		}else if(d<0) {
			System.out.println("Roots are two complex numbers");
			System.out.println("Roots are :"+(-b + Math.sqrt(d))/2*a + " and "+(-b+ Math.sqrt(d))/2*a);
		}
		

	}

}
