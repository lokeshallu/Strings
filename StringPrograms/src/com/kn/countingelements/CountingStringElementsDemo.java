package com.kn.countingelements;

import java.util.Scanner;

public class CountingStringElementsDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputstring = scan.nextLine();
		
		CountingStringElements count = new CountingStringElements();
		count.countingstringelements(inputstring);
		

	}

}
