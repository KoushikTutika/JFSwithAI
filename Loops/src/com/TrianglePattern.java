package com;

public class TrianglePattern {
	public static void main(String[] args) {
		
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//op first half 
		//* 
		//* * 
		//* * * 
		//* * * * 
		//* * * * * 
		
		for (int k=4;k >=1;k--) {
			for(int l=1;l<=k;l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//op second half
		//* * * * 
		//* * * 
		//* * 
		//* 
	}

}
//OP
//* 
//* * 
//* * * 
//* * * * 
//* * * * * 
//* * * * 
//* * * 
//* * 
//* 