package com;

public class UnaryOperators {
	// +,-,!
	public static void main(String[] args) {
		long a = 10;
		long b = 20;
		boolean c =true;
		System.out.println(+a);//+10=10
		System.out.println(-a);//-10
		System.out.println(!c);//false
		
		
	// Increment Operator & Decrement Operators
		a=15;
		b=25;
		
		System.out.println(a);//15
		System.out.println(a++);//15
		System.out.println(a);//16
		System.out.println(++a);//17
		
		System.out.println(b--);//25
		System.out.println(b);//24
		System.out.println(--b);//23
		System.out.println(b);//23
		
		a=20;
		long add = a++ + ++a;
		//20 + 21+1=42
		System.out.println(add);//42
		
		a=10;
		b=15;
		long value = --b + a++ - --a;
		//14 + 10 - 10 =14
		System.out.println(value);//14
		
		a=5;
		b=10;
		long value2 = a++ + --b * ++a;//BODMAS
		//5->6 + 9 * 7 = 68//after crossing operation 5 become 6 as increment
		System.out.println(value2);//68
	}

}
