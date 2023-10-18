package com.kn.camelcase;

import java.util.Scanner;

public class CamelcaseDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String inputstring = scan.nextLine();
		
		Camelcase camelcase = new Camelcase();
		 String sb =camelcase.CameCase(inputstring);
		 System.out.println(sb);

	}

}
