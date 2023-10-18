package com.kn.strings;

public class StringMethods2 {

	public static void main(String[] args) {
	
		String s1 = "       raja rammohan roy  ";
		
		System.out.println("*****Length of the specific String*****");
		System.out.println(s1.length());
		
		System.out.println("******Return true if the string starts with specific string*****");
		System.out.println(s1.startsWith("r"));
		
		System.out.println("******Return true if the string ends with specific string*****");
		System.out.println(s1.endsWith("y"));
		
		System.out.println("*****Returns the sequence of an array*****");
		char []crr = s1.toCharArray();
		for(int i=crr.length-1;i>=0;i--) {
			System.out.print(crr[i]);
			
		}System.out.println(" ");
		System.out.println("*****Returns Array of string split using specific regex(delimiter*****");
		String []srr = s1.split(" ");
		for(int i=srr.length-1;i>=0;i--) {
			System.out.print(srr[i]);
			
		}
		System.out.println(" ");
		System.out.println("*****Returns Array of String trim using specific*****");
      	System.out.println(s1.trim());
      	
      	System.out.println("*****Returns  Array of String replace using specific data*****");
      	System.out.println(s1.replace('r', 'm'));
      	
      	System.out.println("*****Return Array of string replace using all String array data*****");
      	System.out.println(s1.replace(s1, "assam"));
      	
      	
		
		

	}}


