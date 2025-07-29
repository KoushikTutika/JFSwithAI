package com;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2");
		int num2 = sc.nextInt();
		System.out.println("Available Operators are :");
		System.out.println(" 1 = + ,2 = - ,3 = * , 4 = / ,5 = % ");
		System.out.println("Please Enter the Operator");
		
		//operators with int
		int operator = sc.nextInt();
		switch (operator) {
		
		case 1 :
			System.out.println("The operation is addition and the sum of numbers is :"+ (num1+num2));
			break;
		case 2 :
			System.out.println("The operation is substraction and the diference of numbers is :"+ (num1-num2));
			break;
		case 3 :
			System.out.println("The operation is multiplication and the product of numbers is :"+ (num1*num2));
			break;
		case 4 :
			System.out.println("The operation is division and the quotient of numbers is :"+ (num1/num2));
			break;
		case 5 :
			System.out.println("The operation is modulo and the reminder of numbers is :"+ (num1%num2));
			break;
		}
		// operators with char
//		String operator =sc.next();
//       switch (operator) {
//		
//		case + :
//			System.out.println("The operation is addition and the sum of numbers is :"+ (num1+num2));
//			break;
//		case - :
//			System.out.println("The operation is substraction and the diference of numbers is :"+ (num1-num2));
//			break;
//		case * :
//			System.out.println("The operation is multiplication and the product of numbers is :"+ (num1*num2));
//			break;
//		case / :
//			System.out.println("The operation is division and the quotient of numbers is :"+ (num1/num2));
//			break;
//		case % :
//			System.out.println("The operation is modulo and the reminder of numbers is :"+ (num1%num2));
//			break;
//		}
       	sc.close();
	}

}
