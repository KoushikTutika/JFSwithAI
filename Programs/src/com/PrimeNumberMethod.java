package com;

import java.util.Scanner;

public class PrimeNumberMethod {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number ");
		int input = sc.nextInt();
		PrimeNumberMethod PM = new PrimeNumberMethod();
		PM.prime1(input);//1-n
		PM.prime2(input);//2-n
		PM.prime3(input);//2-(n-1)
		PM.prime4(input);//2-(n/2)
		PM.prime5(input);//2-(sqrt(n)
		  
	} 
	
	void prime1(long num) {
		long startTime = System.currentTimeMillis();
		int count = 0;
		int count2 = 0;
		for (int i = 1; i <= num; i++) {
				count2 ++;
			if (num % i == 0) {
				count++;
			}
		}
		System.out.println("CASE 1 \nFactors : "+count);
		System.out.println("Iterations : "+count2);
		if (count == 2) {
			System.out.println("Prime Case 1 : "+num+" PrimeNumber");
		}else {
			System.out.println("Prime Case 1 : "+num+" Not a PrimeNumber");
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total time for iteration is : "+(endTime-startTime));
		
	}
	
void prime2(long num) {
	long startTime = System.currentTimeMillis();
		int count = 0;
		int count2 = 0;
		for (int i = 2; i <= num; i++) {
			count2++;
			if (num % i == 0) {
				count++;
			}
		}
		System.out.println("CASE 2 \nFactors : "+count);
		System.out.println("Iterations : "+count2);
		if (count == 1) {
			System.out.println("Prime Case 2 : "+num+" PrimeNumber");
		}else {
			System.out.println("Prime Case 2 : "+num+" Not a PrimeNumber");
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total time for iteration is : "+(endTime-startTime));
		
	}

void prime3(long num) {
	long startTime = System.currentTimeMillis();
	int count = 0;
	int count2 = 0;
	for (int i = 2; i <= num-1; i++) {
		count2++;
		if (num % i == 0) {
			count++;
		}
	}
	System.out.println("CASE 3 \nFactors : "+count);
	System.out.println("Iterations : "+count2);
	if (count == 0) {
		System.out.println("Prime Case 3 : "+num+" PrimeNumber");
	}else {
		System.out.println("Prime Case 3 : "+num+" Not a PrimeNumber");
	}
	long endTime = System.currentTimeMillis();
	System.out.println("Total time for iteration is : "+(endTime-startTime));
	
}
void prime4(long num) {
	long startTime = System.currentTimeMillis();
	int count = 0;
	int count2 = 0;
	for (int i = 2; i <= num/2; i++) {
		count2++;
		if (num % i == 0) {
			count++;
		}
	}
	System.out.println("CASE 4 \nFactors : "+count);
	System.out.println("Iterations : "+count2);
	if (count == 0) {
		System.out.println("Prime Case 4 : "+num+" PrimeNumber");
	}else {
		System.out.println("Prime Case 4 : "+num+" Not a PrimeNumber");
	}
	long endTime = System.currentTimeMillis();
	System.out.println("Total time for iteration is : "+(endTime-startTime));
	
}

void prime5(long num) {
	long startTime = System.currentTimeMillis();
	int count = 0;
	int count2 = 0;
	for (int i = 2; i <= Math.sqrt(num); i++) {
		count2++;
		if (num % i == 0) {
			count++;
		}
	}
	System.out.println("CASE 5 \nFactors : "+count);
	System.out.println("Iterations : "+count2);
	if (count == 0) {
		System.out.println("Prime Case 5 : "+num+" PrimeNumber");
	}else {
		System.out.println("Prime Case 5 : "+num+" Not a PrimeNumber");
	}
	long endTime = System.currentTimeMillis();
	System.out.println("Total time for iteration is : "+(endTime-startTime));
	
}
}

//OutPut
//Enter the number 
//798797987
//CASE 1 
//Factors : 8
//Iterations : 798797987
//Prime Case 1 : 798797987 Not a PrimeNumber
//Total time for iteration is : 2352
//CASE 2 
//Factors : 7
//Iterations : 798797986
//Prime Case 2 : 798797987 Not a PrimeNumber
//Total time for iteration is : 2332
//CASE 3 
//Factors : 6
//Iterations : 798797985
//Prime Case 3 : 798797987 Not a PrimeNumber
//Total time for iteration is : 2320
//CASE 4 
//Factors : 6
//Iterations : 399398992
//Prime Case 4 : 798797987 Not a PrimeNumber
//Total time for iteration is : 1174
//CASE 5 
//Factors : 3
//Iterations : 28262
//Prime Case 5 : 798797987 Not a PrimeNumber
//Total time for iteration is : 1
