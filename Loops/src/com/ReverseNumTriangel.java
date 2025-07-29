package com;

public class ReverseNumTriangel {
	public static void main(String[] args) {
		for (int i=1;i <=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(j );
			}
			System.out.println();
		}
		for (int k=1;k <=5;k++) {
			for(int l=0;l<=5-k;l++) {
				System.out.print(5-l );
			}
			System.out.println();
		}
		
	}

}
