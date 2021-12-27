package com.bridgelabz.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchWord {
	public static int binarySearch(String[] array , int first , int last , String input_word) {

		int mid = (first+last)/2;                                           

		if(input_word.compareTo(array[mid]) == 0) {
			return mid;                                          
		}
		else if((input_word.compareTo(array[mid])) > 0) {
			first = mid + 1;                                           
			return binarySearch(array, first, last, input_word);
		}
		else if(input_word.compareTo(array[mid]) < 0) {
			last = mid - 1;                                             
			return binarySearch(array, first, last, input_word);
		}
		else {
			return -1;
		}	
	}


	public static void printResult(int result , String input_word) {
		if(result == -1) {
			System.out.println("\n" + input_word + " is not found in the array");
		}
		else {
			System.out.println("\n" + input_word + " is found at index " + result + " ");
		}
	}


	public static void main(String[] args) {
		
	

		String[] array = {"cat","dog","bat","horse","lion","tiger","monkey","zebra","elephant","rat"};

		Arrays.sort(array);                         

		System.out.println("Sorted Array :  " + Arrays.toString(array));     

		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter a word to search : ");
		String input_word = input.nextLine();       

		int first = 0;
		int last = array.length - 1;                  

		int result = binarySearch(array , first , last , input_word);    

		printResult(result, input_word);         
	}

}
