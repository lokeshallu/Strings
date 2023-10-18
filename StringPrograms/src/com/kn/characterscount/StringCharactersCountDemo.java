package com.kn.characterscount;

import java.util.Scanner;

public class StringCharactersCountDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String inputstring = scan.nextLine();
		
		StringCharactersCount count = new StringCharactersCount();
		count.characterscount(inputstring);
		

	}

}
