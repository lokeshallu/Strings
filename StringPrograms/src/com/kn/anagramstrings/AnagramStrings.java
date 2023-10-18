package com.kn.anagramstrings;

public class AnagramStrings {

	

	public boolean anagramString(String s1, String s2) {
		
	     boolean isanagram=false;
		
		if(s1.length()==s2.length()) {	
			char []crr1 =s1.toCharArray();
			char[]crr2 = s2.toCharArray();
			
			
			 crr1=sortcharacterasrray(crr1);
			 crr2=sortcharacterasrray(crr2);
			 
			 for(int i=0;i<crr1.length;i++) {
				 if(crr1[i]==crr2[i]) {
			            isanagram =true;
			            
				 }else {
					 isanagram=false;
					 break;
					 
				 }
				 
			 }
			 
			 
		}
		return isanagram;
		
		
			
			
			
	}

	private char[] sortcharacterasrray(char[] crr) {
		char temp =0;
		boolean isswapeed = false;
		for(int i=0;i<crr.length;i++) {
			for(int j=0; j<crr.length-1-i;j++) {
				if(crr[j]>crr[j+1]) {
				     temp =crr[j];
				     crr[j]=crr[j+1];
				     crr[j+1]=temp;
				     isswapeed =true;
			}
		}if(isswapeed==false) {
			
		break;
		}  
		
		
		
	}
		return crr;
	}}

