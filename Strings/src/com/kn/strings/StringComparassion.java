package com.kn.strings;

public class StringComparassion {

	public static void main(String[] args) {
		String s1 = "Jai";
		String s2 = " Hanuman";
		
		String s3 = s1+"Hanuman";
		String s4 = s2+"Jai";
		
		
		if (s3 == s4) {
			System.out.println(" Reference is pointed the same object");
		} else {
			System.out.println(" Reference value is not pointed to same object");
		}
		if (s3.equals(s4)) {
			System.out.println("String data is same  ");
		} else {
			System.out.println(" String data is not same");
		}
	}

}
