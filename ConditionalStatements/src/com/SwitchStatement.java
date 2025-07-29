package com;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Floor");
		int num = sc.nextInt();

		switch (num) {

		case 1:
			System.out.println("1st Floor");
			break;
		case 2:
			System.out.println("2nd Floor");
			break;
		case 3:
			System.out.println("3rd Floor");// 3rd floor Unknown Floor with out brek
			break;
		default:
			System.out.println("Unknown Floor");
			break;
		// with out break it will print all cases
		}
		
		// day of week using ternery operator
		System.out.println(" Enter number of the week");
	
		int day = sc.nextInt();
		
		
		String dayOfWeek =(day == 1)? "MONDAY" :
							(day ==2)?"TUESDAY":
								(day ==3)? "WEDNESDAY":
									(day ==4)? "THURSDAY":
										(day == 5)? "FRIDAY" : "SATURDAY";
		System.out.println(dayOfWeek);
		
		// day of week using if else 
		
		
		
		
		//day of week using switch
		System.out.println("Enter the week number");
		int week = sc.nextInt();
		switch(week) {
		
		case 1 :
			System.out.println("Monday");
			break;
		case 2 :
			System.out.println("Tuesday");
			break;
		case 3 :
			System.out.println("Wednesday");
			break;
		case 4 :
			System.out.println("Thursday");
			break;
		case 5 :
			System.out.println("Friday");
			break;
		case 6 :
			System.out.println("Saturday");
			break;
		case 7 :
			System.out.println("Sunday");
			break;
			
		}
		
		
		}
		
	

}
