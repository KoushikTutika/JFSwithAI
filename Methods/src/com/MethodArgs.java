package com;

import java.util.Scanner;

public class MethodArgs {
	public static void main(String[] args) {
		MethodArgs MA = new MethodArgs();
		// we are giving arguments  to sumTwoNumber method
		MA.sumTwoNumbers(100,200);
		// methos calling using user input
		Scanner sc =new Scanner(System.in);
		System.out.println("Please Enter the two values");
		int c = sc.nextInt();
		int d = sc.nextInt();
		MA.sumTwoNumbers(c,d);// calling method with input arguments from user
		
		System.out.println("Please Enter the two values");
		int e = sc.nextInt();
		int f = sc.nextInt();
		int result = MA.addNumbers(e, f);
		System.out.println("The result from addNumbers Method which returns sum is "+ result);
		//need to assaign the returntype to a value when calling the method name with return type
		
		
	}
	
	//Arguments
	void sumTwoNumbers(int a , int b) {// we can give the numbers in main method
		int sum= a+b;
		System.out.println("The sum from sumTwoNumbers Method with no return type  is "+ sum);
	}
	
	int addNumbers(int a,int b) {
		int sum = a+b;
		return sum;
	}

}
