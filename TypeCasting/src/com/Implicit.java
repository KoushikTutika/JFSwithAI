package com;

public class Implicit {
	public static void main(String[] args) {
		byte b = 127;// we cannot assain 128 here as the range of byte is -128 to 127
		//implicit
		short s=b;
		s=12000;
		int i = s;
		long l = i;
		
		float f =12.345f;
		double d =f;
		
				
		System.out.println("Byte : "+b);
		System.out.println("Short : "+s);
		System.out.println("Int : "+i);
		
		System.out.println("Long : "+f);
		System.out.println("Double : "+d);
	}

}
