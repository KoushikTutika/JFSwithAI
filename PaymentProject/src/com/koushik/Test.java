package com.koushik;

import com.koushik.db.DataBase;
import com.koushik.cart.Cart;

public class Test {
	
	static int age = 10;//static variable
	int salary = 20; //instance variable
	String name1 = "Koushik";
	public static void main(String[] args) {
		System.out.println(age);
		String name2 = "Jack";  //local variable
		System.out.println(name2); 
//	difference between calling static variables and local variables
		System.out.println(age);//static variable
		Test t = new Test();
		Test t1 = new Test();
		System.out.println(t.name1);//instance variable
		System.out.println(t1.salary);//instance variable
//		after import calling non static method  in other package
		DataBase d=  new DataBase();
		d.connect();
//		importing and calling static method  in other package
		Cart.add();
//		importing static variable from other package
		System.out.println(Cart.price); 
		
	}

}
