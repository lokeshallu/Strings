package com.kn.ciphextext;

import java.util.Scanner;

public class Ciphertextdemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the elements");
		String inputstring = scan.nextLine();
		System.out.println(" enter the increment value");
		int n = scan.nextInt();
		
		Ciphertext ciphertext = new Ciphertext();
		String sb = ciphertext.cipherText(inputstring,n);
		System.out.println(sb);

	}

}
