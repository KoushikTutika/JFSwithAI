package com;

public class RelationalOperators {
	public static void main(String[] args) {
		int a = 10;
		int b = 11;
		
		int c;//Deceleration
		c=20;//Initialization
		System.out.println(c);
		boolean lessthan = a<b;
		boolean greaterthan = a>b;
		System.out.println(a==b);//false
		System.out.println(lessthan);//true
		System.out.println(greaterthan);//false
		
		System.out.println(a >= b);//false
		System.out.println(a <= b);//true
		
		System.out.println(a != b);//true
	}

}
