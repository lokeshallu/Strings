package com.kn.stringReverseWithSpace;

public class ReverseString {

	String reverse(String str) {
		
		char []arr =str.toCharArray();
		char []rev = new char[arr.length];
		// copy spaces------------------------------
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==' ') {
				rev[i]=arr[i];
				
			}
		}
//		reverse the string------------------
		int j=rev.length-1;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]!=' ') {
				if(rev[j]==' ') 
				{
					j--;
				}
				rev[j]=arr[i];
				 j--;
			}
		}
		 str = new String(rev);
		return str;
		
	}

}
