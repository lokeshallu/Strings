package com.kn.palindrome;

import java.util.Scanner;

public class PalindromeDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("----- Enter the string Data ----");
          String s = new String(scan.next());
          
          Palindrome pali = new Palindrome();
         boolean res= pali.palindrome(s);
         if(res==true) {
        	 System.out.println("is a palindrome");
         }else {
        	 System.out.println("it is not a palindrom");
         }
		
		
		
	}

}
