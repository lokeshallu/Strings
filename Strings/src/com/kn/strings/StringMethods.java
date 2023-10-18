 package com.kn.strings;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = " Allu lokesh";
		System.out.println(" To conver String  data in upper case");
		System.out.println(s1.toUpperCase());

		System.out.println(" To conver String data in lower case");
		System.out.println(s1.toLowerCase());

		System.out.println(" Return the character at specific index ");
		System.out.println(s1.charAt(7));

		System.out.println(" Return the  Index value for first occurance of specific character");
		System.out.println(s1.indexOf('A'));

		System.out.println(" Return the index value for last occurance of specific character");
		System.out.println(s1.lastIndexOf('l'));

		System.out.println("Return the String starting form specific index");
		System.out.println(s1.substring(5));

		System.out.println("Return the String for beginning index to till ending index");
		System.out.println(s1.substring(2, 9));

		System.out.println(" Return true if specified string found else if failed");
		System.out.println(s1.contains("Lokesh"));

	}

}
