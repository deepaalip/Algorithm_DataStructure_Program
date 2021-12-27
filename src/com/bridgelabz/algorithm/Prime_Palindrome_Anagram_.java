package com.bridgelabz.algorithm;

import java.util.Scanner;

public class Prime_Palindrome_Anagram_ {
	public static void main(String args[])  
    { 
		for(int i = 1; i<=1000; i++) {
			if( checkPalPrimeNumber(i) ) {
				System.out.println(i);
			}
		}
		
		
    }
		static boolean checkPalPrimeNumber( int number){  
	          
	        
	        int temp, rem, i;  
	        int count = 0;  
	        int sum = 0;  
	          
	      
	        temp = number;  
	          
	      
	        for(i = 1; i <= temp; i++)  
	        {  
	            if(temp%i == 0)  
	            {  
	                count++;    

	            }  
	        }  
	          
	        while(number > 0)  
	        {  
	           
	            rem = number%10;  
	              
	            sum = sum*10+rem;   
	              
	            number = number/10;   
	        }  
	          
	       
	        if(temp == sum && count == 2)  
	            return true;  
	        else  
	            return false;  
	    }  
		
		
		
		
		
}















