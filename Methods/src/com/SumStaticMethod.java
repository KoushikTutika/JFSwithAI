package com;

public class SumStaticMethod {
	
	//static method with return type
	static int add() {// method declaration
		 int g=100;
		 int h=200;
		 int sum= g+h;
		 System.out.println(sum);
		 return sum;
		 
	}
	
	//static method with void type(no return)
	static void mix() {// method declaration
		int g=400;
		int h=600;
		int sum = g+h;
		System.out.println(sum); 
	}
		 
		
	public static void main(String[] args) {
		
		
		// static method calling with return type
		// we need to assign the return value   to return type value with  name
		// Assigned value = class name.methodname()
//		int addition = SumStaticMethod.add();
//		System.out.println(addition);
		SumStaticMethod.add();
		
		
		
		// method calling with no return type 
		// simply classname.methodname()
		
		SumStaticMethod.mix();
				 
	}

}
