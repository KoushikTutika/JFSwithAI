package com;
import java.util.Scanner;
public class IfElse {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter the Number");
		int a = sc.nextInt();
		
		if (a>0) {
			System.out.println("Positive");
		}
		else if (a==0) {
			System.out.println("Zero");
		}
		else {
			System.out.println("Negative");
		}
         Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Please Enter the 2nd  Number");
		int b = sc1.nextInt();
		
		if (b>0) {
			System.out.println("Positive");
		}
		if (b==0) {
			System.out.println("Zero");
		}
		if (b<0) {
			System.out.println("Negative");
		}
	}

}
