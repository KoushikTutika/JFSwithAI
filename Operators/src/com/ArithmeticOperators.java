package com;
public class ArithmeticOperators {
	public static void main(String[] args) {
//Arithmetic Operators
		int a =5;
		
		int b = 20;
		
		int c = 4;
		
		int d = 2;
		
		char ch = 'A';
		int ascii = ch;
		System.out.println(ascii);
		System.out.println("The ASCII value of " + ch + " is: " + ascii);
		String company ="KCSP";
		String location = "Hyderabad";
		
		String addition2 = company+location;
		String addition3 = "company"+"location";
		System.out.println(addition2);//KCSPHyderabad
		System.out.println(addition3);//companylocation
		System.out.println(company+"-"+location);//KCSP-Hyderabad
		
		//java will operate from left to right
		System.out.println(a+b+"ab");//25ab
		
		System.out.println("ab"+a+b);//ab205
		
		System.out.println(a+b+"ab"+c);//25ab4
		
		System.out.println(a+b+"ab"+c+d);//25ab42
		//(after string from left to right it will concatinate with string ab and print as ab42)
		
		int addition =a+b;
		
		int substraction =b-a;
		
		int multiplication =a*b;
		
		int quotient =b / a;
		
		int reminder = c % a;
		
		System.out.println("The sum of a,b is a+b "+addition);//The sum of a , b is 25
		System.out.println("The Substarction of a from b is "+substraction);
		System.out.println("The multiplication of a,b is "+multiplication);
		System.out.println("The quatient  of b devided by a is "+quotient);
		System.out.println("The reminder  of c devided by a is "+reminder);
		
		float e = 7.0f;
		float f = 2.0f;
		
		System.out.println(e+f);//9.0
		System.out.println(f-e);//-5.0
		System.out.println(e-f);//5.0
		System.out.println(e*f);//14.0
		System.out.println(e/f);//3.5
		// for floating number devided by function work exactly and will not return the quotient and 
		//devide the numbers and retrun the floating number result
		//but for modulo it will return the reminder
		System.out.println(e%f);//1.0
	
// assignment operator
		a=a+2;//now a become 7
		System.out.println(a);
		a+=2;//same as a=a+2 and now a become 7+2 =9
		System.out.println(a);
		a-=2;//same as a=a-2 and now a become 9-2 =7
		System.out.println(a);
		a*=2;
		System.out.println(a);//a become 14
		a/=2;
		System.out.println(a);//a become 7
		a%=2;
		System.out.println(a);//a become 1(reminder)

	}

}

// OUTPUT
//KCSPHyderabad
//companylocation
//KCSP-Hyderabad
//25ab
//ab520
//25ab4
//25ab42
//The sum of a,b is a+b 25
//The Substarction of a from b is 15
//The multiplication of a,b is 100
//The quatient  of b devided by a is 4
//The reminder  of c devided by a is 4
//9.0
//-5.0
//5.0
//14.0
//3.5
//1.0
//7
//9
//7
//14
//7
//1

