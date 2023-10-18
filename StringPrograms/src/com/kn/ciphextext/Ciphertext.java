package com.kn.ciphextext;

public class Ciphertext {

	public String cipherText(String inputstring, int n) {
	
		char []crr =inputstring.toCharArray();
		StringBuffer sb = new StringBuffer();
		while(n>26) {
			n=n-26;
		}
		for(int i=0;i<crr.length;i++) {
			
			if(crr[i]>=65 && crr[i]<=90-n || crr[i]>=97&&crr[i]<=122-n) {
//				if(crr[i]<=122 || crr[i]<=97)
				crr[i]=(char)(crr[i]+n);
				
			}else {
				
				crr[i]=(char)(crr[i]+n-26) ;
			}
		}for(char c:crr) {
			sb.append(c);
		}
		
		
		
		
		
		
		
		return sb.toString();
	}

}
