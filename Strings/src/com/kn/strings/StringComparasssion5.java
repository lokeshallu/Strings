package com.kn.strings;

public class StringComparasssion5 {
	public  static void main(String []args) {
		
		String s1 = "jai";
		String s2 = "hanuman";
		
		String s3 = s1+"hanuman";
		String s4 = s1+s2;
		
		
		if(s3==s4) {
			System.out.println(" Reference are pointed to the same object");
		}else {
			System.out.println(" Reference are not pointed to the same object");
		}if(s3.equals(s4)) {
			System.out.println("String Data is equal");
		}else {
			System.out.println(" String Data is notEqual");
		}
		
	}

}
