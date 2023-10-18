package com.kn.duplicateremove;

import java.util.Scanner;

public class DuplicateDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 String s1 = scan.nextLine();
//	 char ch = scan.next().charAt(0);
//		 char []crr = s1.toCharArray();
		 
		 
		 
		  Duplicate duplicate = new Duplicate();
		 duplicate.duplicateremove(s1);
		 
		  
	
		 }
	}

