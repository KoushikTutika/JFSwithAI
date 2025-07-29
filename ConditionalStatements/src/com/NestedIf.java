package com;

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Marks");
		int marks = sc.nextInt();

		if (marks > 50 && marks <= 100) {// 51-100
			System.out.println("You are Passed !!!!");
			if (marks > 90 && marks <= 100) {// 91-100
				System.out.println("Grade A");
			} else if (marks > 70 && marks <= 90) {// 71-90
				System.out.println("Grade B");
			} else if (marks > 50 && marks <= 70) {// 51-70
				System.out.println("Grade C");
			}
		} else if (marks >= 0 && marks <= 50) {// 1-50
			System.out.println("Failed.....!");
		} else {// negative marks
			System.out.println("Invalid...!");
		}
	// age validation	
		System.out.println("Enter Your Age");
		int age = sc.nextInt();
		System.out.println("Do you have License..?");
		boolean hasLicense =sc.nextBoolean();
		
//		System.out.println("");
		
		if (age >= 18) {
			if (hasLicense) {
				System.out.println("You Can Drive");
			} else {
				System.out.println("Please Apply for License");
			}
		} else {
			System.out.println("You are Minor You CANT Drive");
		}
		
		
	}
}
		
	


