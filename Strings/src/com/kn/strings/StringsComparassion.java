package com.kn.strings;

import java.util.Scanner;

public class StringsComparassion {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		String s1 = " lokesh";
		String s2 = " lokesh";
		String s3 = new String("compare");
		String s4 = new String ("compare");
		String crr = scan.next();
		String s5 = new String (crr);
		
		if(s1==s2) {
			System.out.println(" Reference are ponted to same object ");
		}else {
			System.out.println(" Reference is not pointed same object");
		}if(s1.equals(s2)) {
			System.out.println(" string Data is same ");
		}else {
			System.out.println(" string Data is not same");
		}
		
		if(s3==s4) {
			System.out.println(" Reference are pointed same object");
		}else {
			System.out.println(" Reference are not pointed same object");
		}if(s3.equals(s4)) {
			System.out.println(" String Data is equal");
			
		}else {
			System.out.println(" String Data is not Equal");
		}System.out.println(s5);
	}

}
