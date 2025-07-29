package com;

import java.util.Scanner;

public class Restuarent {
	public static void main(String[] args) {
		
		System.out.println("The Available menu is : ");
		System.out.println("1. Chicken 65");
		System.out.println("2. Panner");
		System.out.println("3. Biryani");
		System.out.println("4. Meals");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your option");
		int option = sc.nextInt();
		
		switch(option) {
			case 1 :
				System.out.println("Your order chiken 65 is palced");
				break;
			case 2 :
				System.out.println("Your order panner is placed");
				break;
			case 3 :
				System.out.println("Your order Biryani is palced");
				break;
			case 4 :
				System.out.println("Your order Meals is palced");
				break;
		}
		sc.close();
	}
	

}
