package com.kn.palindrome;

public class Palindrome {

	boolean  palindrome(String s) {
		
		StringBuffer str = new StringBuffer()
		for (int i = s.length() - 1; i >= 0; i--) {
			str = str.append(s.charAt(i));
		}
		if (str.toString().equalsIgnoreCase(s)) {
			return true;
		} else {
			return false;
		}
	}
}
