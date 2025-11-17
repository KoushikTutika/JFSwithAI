package com;

public class InstanceMethod {
	 
	//Method -> which is used to execute a block of code 
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		int c=a+b;
		System.out.println(c);
		
		a=25;
		b=35; 
		
		c=a+b;
		System.out.println(c);
		
		InstanceMethod tm =new InstanceMethod();
		tm.sum();
		//sum method called with object instantiation because it was instance method so object instantiation should be done
 	}
	
	// nonstatic method (Instance method)
	void sum(){//Method decleration
		int a =10;
		int b=20;
		int c= a+b;
		
		System.out.println(c);
	}//it is nonstatic (instance method) it should be called in main method with help of object
	

}

//points to remember for methods
	//1 Meaningful name as method name
	//2 return type before method name
	//3 8 primitive data types or non primitive datatypes
	// method should be called in main method 
