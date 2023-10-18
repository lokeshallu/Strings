package com.kn.stringsleve2;

import java.util.Scanner;

public class LengthCheckerDemo {

	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the string 1 ");
       String str1 = new String(scan.next());
       System.out.println("Enter the string 2");
       String str2 = new String(scan.next());
       
       LengthChecker checker = new LengthChecker();
     boolean res=  checker.checkerlength(str1,str2);
       if(res==true) {
    	   System.out.println("lengths of the strings are same "+str1+"&"+str2);
       }else {
    	   System.out.println("lengths of the string are not same "+str1+" & "+str2);
       }
       
       
	}

}
