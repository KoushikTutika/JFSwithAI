package com;

import java.util.Scanner;

public class SumOfDigits {
	
public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Please Enter the Number");
		int num =sc.nextInt();
		int count = 0;
		int sum = 0;
		while(num>0) {
			sum = sum + (num%10);
			num = num/10;
			count ++;
			
		}
		
		System.out.println("number of digits : "+count);
		System.out.println("sum of digits : "+sum);
	}

}
