package com.kn.duplicateremove;

public class Duplicate {

	public  void duplicateremove(String s1 ) {
		
		 char []crr = s1.toCharArray();
		 StringBuffer sb = new StringBuffer();
		 
		 for(int i=0;i<crr.length;i++) {
			 int count =0;
			 for(int j=i+1;j<crr.length;j++) {
			  if(crr[i]==crr[j]) {
				
					 count++;
					 
				 }
			 }if(count ==1) {
				 System.out.println(crr[i]);
				 
			 }
				  
				  
		 }
		
		
			 
		
		}}

	
	


