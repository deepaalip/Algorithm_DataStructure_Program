package com.bridgelabz.algorithm;

public class InsertionSort {
	static String key;
	private static void printArray(String[] str) {
		for(int i=0; i<str.length;i++) {
			System.out.println(str[i]+"");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		String str [] = {"W","E","L","C","O","M","E"};
		for(int i =0 ; i<str.length;i++) {
			String current = str[i];
			int j = i-1;
			while(j >= 0 && current.compareTo(str[j])<0) {
				str [j +1] = str [j];
				j--;
				
			}
			 str [j+1]=current;	
			}
			
		
		printArray(str);
	}

}
