package com;

import java.util.Scanner;

public class MarksIfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks = sc.nextInt();
		
		if(0<marks && marks<=50) {
			System.out.println("Fail");
		}
		else if (marks >50 && marks <=70) {
			System.out.println("Grade C");
		}
		else if (marks > 70 && marks <= 90) {
			System.out.println("Grade B");
		}
		else{
		System.out.println("Grade A");
		}
	}

}
