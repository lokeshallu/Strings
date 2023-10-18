package com.kn.concat;

import java.util.Scanner;

public class ConcatBySameLengthDemo {

      public static void main(String[] args) 
      {
    	  Scanner scan = new Scanner(System.in);
    	  System.out.println("----Enter the string 1----");
    	  String s1 = scan.next();
    	  System.out.println("----Enter the string 2----");
    	  String s2 = scan.next();
    	  
    	  ConcatBySameLength clength = new ConcatBySameLength();
    	  String res =clength.concat(s1,s2);
    	  if(res!=null) {
    		  System.out.println("concatnated string is "+res);
    	  }else {
    		  System.out.println("Strings are not same to concatnation "+res);
    	  }
    	 
	  }


}
