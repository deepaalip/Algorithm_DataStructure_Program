package com.bridgelabz.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static boolean isAnagram(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		else {
			char[] str1Array = str1.toCharArray();
			char[] str2Array = str2.toCharArray();
			
			Arrays.sort(str1Array);
			Arrays.sort(str2Array);
		
			
			return Arrays.equals(str1Array, str2Array);
			
		}
	
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 
		System.out.println("Enter you first string1 :");
		    String str1 = input.nextLine();
		    
		System.out.println("Enter you second string2 :");
		    String str2 = input.nextLine(); 
		    
		 str1 = str1.toLowerCase();
		 str2 = str2.toLowerCase(); 
		 
		 if(isAnagram(str1,str2)) {
			 System.out.println("Strings " +str1 + " and " + str2 + " are Anagram");
			 
		 }
		 else {
			 System.out.println("Strings " +str1 +"and" + str2 + " are NOT Anagram");
		 }
		    
		    
		 
	}
	
	
}
