package com;

import java.util.Scanner;

public class TestLoops {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many times you want to print");
		 int times = sc.nextInt();
		 
		 // how many times  loop should iterate
		 
		 for(int i = 1;i <= times ; i++) {
			 System.out.println(i+". Hi For Loop");
		 }
		 
		 
		 // up to when user should stop
		 System.out.println("Enter the Number");
		 times = sc.nextInt();
		 while(times != 0) {
			 System.out.println(times +"Times");
		     times = sc.nextInt();// until you give 0 it will run in loop 
		 
		 }
		 
		 
		
		
		
	}

}
