package com.kn.anagramstrings;

import java.util.Scanner;

public class AnagramStringsDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the element 1 =");
		String s1 = scan.nextLine();
		System.out.println("enter the element 2 =");
		String s2 =scan.nextLine();
		
		AnagramStrings anagramstring = new AnagramStrings();
		boolean isangram=anagramstring.anagramString(s1,s2);
		if(isangram) {
			System.out.println(s1+"&"+s2+" is a Anagram String");
		}else {
			System.out.println(s1+"&"+s2+" is not a Anagram string");
		}
		
		}

	}


