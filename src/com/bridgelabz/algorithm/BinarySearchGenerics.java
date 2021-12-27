package com.bridgelabz.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchGenerics <T extends Comparable <T>>{
	
	
		public static <T extends Comparable <T>> Integer binarySearch(T[] array , int first , int last , T input_word) {
		
			Integer mid = (first + last)/2;                                       
		
			if(((String) input_word).compareTo((String) array[mid]) == 0) {
				return mid;                                           
			}
			else if((((String) input_word).compareTo((String) array[mid])) > 0) {
				first = mid + 1;                                           
				return binarySearch(array, first, last, input_word);
			}
			else if(((String) input_word).compareTo((String) array[mid]) < 0) {
				last = mid - 1;                                            
				return binarySearch(array, first, last, input_word);
			}
			else {
				return -1;
			}	
		}
		
	
		public static <T extends Comparable<T>> void printResult(Integer result , String input_word) {
			if(result == -1) {
				System.out.println("\n" + input_word + " is not found in the array.");
			}
			else {
				System.out.println("\n" + input_word + " is found at index " + result + ".");
			}
		}
		
		
		public static void main(String[] args) {
		
			System.out.println("--------------WELCOME TO BINARY SEARCH THE WORD FROM AN ARRAY----------------\n");
			
			String[] array = {"cat","dog","bat","horse","lion","tiger","monkey","zebra","elephant","rat"};
			
			Arrays.sort(array);                          
			
			System.out.println("Sorted Array :-  " + Arrays.toString(array));     
			
			Scanner input = new Scanner(System.in);
			System.out.print("\nEnter a word to search :- ");
			String input_word = input.nextLine();        
			
			Integer first = 0;
			Integer last = array.length - 1;                  
			
			Integer result = binarySearch(array , first , last , input_word);    

			printResult(result, input_word);        
		}

}
