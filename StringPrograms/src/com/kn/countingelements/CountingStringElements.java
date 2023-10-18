package com.kn.countingelements;

public class CountingStringElements {

	public void countingstringelements(String inputstring) {
	         
		
		char []crr =inputstring.toCharArray();
		int count =1;
		for(int i=0;i<crr.length;i++) {
			
			for(int j=0;j<crr.length-1;j++) {
				if(crr[j]==crr[j+1]) {
					count++;
				}else {
					System.out.println(crr[j]+" ="+count);
					count=1;
					
				}
				if(j+1==crr.length-1) {
				if(crr[j+1]==crr[j]) {
					
					count++;
					
					
				}else {
					
					
					 System.out.println(crr[j+1]+"= "+count);
					 
					 count=1;
					 
					
				}
			
			}  
		}
		
		
		
		}
		
	}
		


	private char[] tosort(char[] crr) {
		for(int i=0;i<crr.length;i++) {
			int temp =0;
			for(int j=0;j<crr.length-1-i;j++) {
				if(crr[j]>crr[j+1]) {
					temp = crr[j];
					crr[j]=crr[j+1];
					crr[j+1]=(char) temp;
					
				}
			}
		}
		return crr;
		
	}
	}


