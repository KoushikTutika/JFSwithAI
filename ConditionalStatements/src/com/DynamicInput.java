package com;

import java.util.Scanner;

public class DynamicInput {
	public static void main(String[] args) {
		
		//scanner class
		//object creation
		//ClassName ObjName = new ClassName();
		Scanner sc = new Scanner(System.in);
		//sc.nextInt();
		//sc.nextByte();
		//sc.nextShort();
		//sc.nextLong();
		//sc.nextBoolean();
		//sc.nextFloat();
		System.out.println("Please enter marks");
        int mark = sc.nextInt();
		
		String STGrade = (mark > 90) && (mark <=100) ? "Grade A" :
		(mark > 70) && (mark <=90) ? "Grade B" :
		(mark > 50) && (mark <=70) ? "Grade C" :
		(mark > 0) && (mark <=50) ? "Fail" : "Invalid";
		
		System.out.println(mark +"Marks :  "+ STGrade);
		//sc.nextLine();// will allow spaces
		//sc.next();//will not allow spaces
		sc.nextLine();//to get skipped after entering the Enter key which will take space as string
		System.out.println("Enter the Name");
		String name = sc.nextLine();//Koushik Tutika
		
		System.out.println(name);//Koushik 
		
		System.out.println("enter the name 2");
		String name2 = sc.next();//Koushik Tutika
		//output  => Koushik
		
		System.out.println(name2);//Koushik
		sc.close();
		
		
	}

}
