package com.kn.strings;

public class StringComparision {

	public static void main(String[] args) {
	  String s1 ="Ram";
	  String s2 = "sita";
	
	  
	  String s3 ="Rama"+"sita";
	  String s4 ="Rama"+"sita";
	  
	  
	  
	  
	  
	  if(s3==s4) {
		  System.out.println(" References are pointed to same objectt");
	  }else {
		  System.out.println(" References are  not pointed to same objectt");
		  
	  }if(s3.equals(s4)) {
		  System.out.println(" String dats is equal");
	  }else {
		  System.out.println("String data is notEqual");
	  
	 

	}

	}}
