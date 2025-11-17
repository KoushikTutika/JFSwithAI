package com;

public class Explicit {
	public static void main(String[] args) {
		
		short s =98;
		
		//byte  b = s;
		//java will not take even byte can accommodate 100  but byte cannot be implicitly type cast from short
		byte b =(byte)s;
		
		char c =(char)s;
		
		int num='A';//it will ascii value of A
		
		int i =(int) 35.45f;//typecasting float into int
		
		System.out.println("Short :"+s);
		System.out.println("Byte :"+b);
		System.out.println(c);
		System.out.println("ascii :"+num);
		System.out.println(i);
		
	}

}


//OutPUT

//Short :128
//Byte :-128
//because we gave short 128 and byte will accommodate till 127 so datal loss will happen and 
//it will go back from start and print -128 value
//if s=130 ==> b= -126 because byte is from -128 to 127
//if s=256 ==> b= 0 because byte is from -128 to 127 and it will circle back to 0 
//if s=98 c= b (ascii value)it will print asci value of  98
