package com.datatypes;

public class TestClass_1 {
	static char c;
	public static void main(String[] args) {
		byte byteValue = 127;
		short shortValue = 32767;
		int intValue = 1234567890;
		long longValue = 123456789012345678l;
		
		float floatValue = 0.12345678910f;
//		in float after 7 digits it will round off and will print 0.12345679
		double doubleValue = 0.123456789012345678901;
//		in double it will update after 16 digits
		
		char charValue = 'A';
		char charValue1 ='@';
		
		boolean booleanValue = true;
		boolean booleanFalse = false;
		
		System.out.println("The byte value is "+byteValue);
		System.out.println("The short value is "+shortValue);
		System.out.println("The int value is "+intValue);
		System.out.println("The long value is "+longValue);
		System.out.println("The float value is "+floatValue);
		System.out.println("The double value is "+doubleValue);
		System.out.println("The char value is "+charValue);
		System.out.println("The boolean value is "+booleanValue);
		System.out.println("The default value of char is "+c);// space
		System.out.println("The int value is "+intValue);
		
	}
}
