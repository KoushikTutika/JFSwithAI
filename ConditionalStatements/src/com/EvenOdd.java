package com;

import java.util.Scanner;


public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		
		if (num == 0) {
		System.out.println("Zero Number");
		}
		else if (num % 2 ==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		
	}

}

