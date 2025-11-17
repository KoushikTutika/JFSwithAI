package com;

import java.util.Scanner;

public class MethodsInStrings {
	
	public static void main(String[] args) {
		
		String s ="FLMEDU";
		String s2 ="FLMEDU";
		
		String st = new String("FLM");
		String st2 = new String("FLM");
		String st3 = new String("FLMEDUTECH");
		
		MethodsInStrings obj =new MethodsInStrings();//object for calling instance method(findLength)
		
		System.out.println("s==s2 : "+s==s2);// true because of same memory address at string constant pool not because of same value 
		System.out.println("st==st2 : "+st==st2);// false because of different memory address i heap area as string was in object form
	
		//System.out.print("HashCodes Are \n"+s.hashCode()+"\n"+s2.hashCode()+"\n"+st.hashCode()+"\n"+st2.hashCode());
		//System.out.println();
		
		//obj.findLength("FLM");//calling findLength method
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Please enter the String");
		String si = sc.next();//input as string
		
		System.out.println("Please enter the index you want");
		int ii =sc.nextInt();
		
		MethodsInStrings.printCharAtIndex(si,ii);//calling static method with classname and methodname and user input as parameter
		
		obj.findLength(si);//length
		obj.checkIfEmpty(si);//false
		obj.checkIfEmpty("");//true
		obj.checkIfBlank(" ");//true if blank
		obj.findLength("         A");//10
		obj.checkIfEmpty("       A");//false
		obj.checkEqualsIgnoreCase(si, "koushik");//if i give KOUSHIK it will give true 
		
		
		System.out.println("Contains : "+st.contains(st2));//flm conatins in  flmedu
		System.out.println("Startwith : "+st2.startsWith(st));//flmedu starts with   flm
		System.out.println("Equals : "+st.equals(st2));// true as it compare the contents
		System.out.println("EndsWith : "+s2.endsWith(s));//flm ends with   flm
		System.out.println("Index of L : "+st3.indexOf('e'));//index of e is 3 in FLMEDUTECH // it will fetch only first index occurance
		System.out.println("LastIndex of L : "+st3.lastIndexOf('e'));//last index of e is 8 in FLMEDUTECH // it will fetch only last (second) index occurance
		System.out.println("LastIndex of L : "+st3.lastIndexOf('s'));//it will give -1 as s was not there in flmedutech
		
		//substring//piece of a string pro in Programming
		System.out.println("SubString of st3 : "+st3.substring(0,3));//first index =0 and one index after last index pro=0 to 2 but need to give 3 
		System.out.println("SubString of st3 : "+st3.substring(7));//last sub string which give from index of 7 and it will go till end
		
		
		
	}
	void findLength(String s) {//giving dynamic input from main method(parameter and type  in method)
		
		//String s="FLM";// commented as this input is giving in main method at the time of method calling with parameter
		System.out.println("The length of string is "+s.length());
	}
	
	static void printCharAtIndex(String s,int index) {// method with parameters from user input
		System.out.println("The char at index " +index+" is :"+s.charAt(index));
	}
	
	void checkIfEmpty(String s) {
		System.out.println("checkIfEmpty : "+s.isEmpty());//false its not empty
		
	}
	void checkIfBlank(String s) {
		System.out.println("checkIfBlank : "+s.isBlank());//false its not blank
	}
	void checkEqualsIgnoreCase(String s1,String s2) {
		System.out.println("checkEqualsIgnoreCase : "+s1.equalsIgnoreCase(s2));//compare the content of string excluding case sensitivity
	}

}
