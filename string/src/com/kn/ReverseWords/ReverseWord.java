package com.kn.ReverseWords;

public class ReverseWord {

       public static void reverse(String str) {
		String []arr= str.split(" ");
		
		for(int i=0;i<arr.length;i++) {
	    char crr[]=arr[i].toCharArray();
			    
	    for(int j=crr.length-1;j>=0;j--) {
	    	System.out.print(crr[j]);
	    }System.out.println(" ");
		}
	
	
       }

}
