package com;

public class LogicalOperators {
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;
		
		System.out.println(b1 && b2);//false
		System.out.println(b1 && b3);//true
		System.out.println(b2 && b3);//false
		System.out.println(b2 && b4);//false
		
		System.out.println(b1 || b2);//true
		System.out.println(b1 || b3);//true
		System.out.println(b2 || b3);//true
		System.out.println(b2 || b4);//false
		
		System.out.println(b1 && b2 && b3);//false
		System.out.println(b2 || b3 || b4);//true
		
		System.out.println(b1 || b2 && b3);// true || false && true => first && will operate and then ||
		//&& has highest precedence // output was true
		System.out.println(b1 || b2 && b3 || b4);//true
		System.out.println(b1 || b2 && (b3 || b4));//true
		System.out.println(b2 || b1 && (b2 || b4));// brackets have highest precedence then && and then ||
		// output was False
		
		
		
		int num1 = 10;
		int num2 = 30;
		int num3 = 10;
		boolean result = (num1 < num2) && (num2 >= num3);//relational and logical 
		System.out.println(result);//true
		
		boolean result2 = (num1 >= num3) || (num1 != num3) && (num2 < num3);//true
		System.out.println(result2);//true
		
		System.out.println(!result2);//false
		
	}
}
