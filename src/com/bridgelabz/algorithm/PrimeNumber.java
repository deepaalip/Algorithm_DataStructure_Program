package com.bridgelabz.algorithm;

public class PrimeNumber {

	public static void main(String[] args) {
		int temp = 0;
		
		for(int num=1; num<=1000; num++) {
			for(int j=2; j<=num- 1;j++) {
				
				if(num % j == 0) {
					temp = temp + 1;
					
			}
		}		
				
			if(temp == 0) {
					System.out.println("Prime number: " +num);
				}
				else {
					temp = 0;
				}
				
			
		}
	}
}
