package com;

public class TernaryOperator {
	public static void main(String[] args) {
		int a = 10;
		int b = 9;
		
		boolean isALarge = (a>b) ? true : false;// condition is true so it will go to expression before the :
		System.out.println(isALarge);//true
		
		String result  = (a>b) ? "a is big" : "a is small";// condition is true so it will go to expression before :
		System.out.println(result);//a is big
		
		int age =19;
		String vote = (age >= 18) ? "can vote" : "cannot vote";
		System.out.println(vote);//can vote
		
		int num =2;
		String res = (num>0) ? "positive" : "negaative";//positive
		
		System.out.println(res);//positive
		
		int num2 =-2;
		String type = (num2>0) ? "positive" : "negaative";//positive
		
		System.out.println(type);//negative
		
		int zero = 0;//nested ternary operators 
		String zeroType = (zero > 0) ? "Positive" : (zero == 0) ? "Zero" : "Negative";
		System.out.println(zeroType);
	
		//Ternary Operators task
		//int marks = 100;//Grade A
		//int marks = 80;//Grade B
		int marks = 60;//Grade C
		//int marks = 40;// fail
				
		String Grades = (marks > 90) ? "Grade A" : (marks > 70) ? "Grade B" /*: (marks > 50) ? "Grade C" */: (marks <= 50) ? "fail" : "Grade C";
		System.out.println(Grades);
		
		int mark = 75;
		
		String STGrade = (mark > 90) && (mark <=100) ? "Grade A" :
		(mark > 70) && (mark <=90) ? "Grade B" :
		(mark > 50) && (mark <=70) ? "Grade C" :
		(mark > 0) && (mark <=50) ? "Fail" : "Invalid";
		
		System.out.println(STGrade);
		
	}
	
}
