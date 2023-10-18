package com.kn.camelcase;

public class Camelcase {

	public String CameCase(String inputstring) {
		
		String []srr = inputstring.split(" ");
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<srr.length;i++) {
			char []crr =srr[i].toCharArray();
		 for(int j=0;j<1;j++) {
			 if(crr[0]>=97&&crr[0]<=122) {
				 crr[0]= (char)(crr[0]-32);
				 
			 }
				
			}
		
		
		for(char c:crr) {
			sb.append(c);
		}sb.append(" ");
		}
		return sb.toString();
	
		
	}

}
