package com.bridgelabz.algorithm;

import java.util.Arrays;

public class BubbleSortGeneric<T extends Comparable<T>> {
	
		public static <T extends Comparable<T>> void bubbleSorting(T[] array) {
			for(Integer i = 0 ; i < array.length; i++) {
				for(Integer j = 0; j < array.length-1-i; j++) {
					if(array[j].compareTo(array[j+1]) > 0) {
						Integer temp = (Integer) array[j];             
						array[j] = array[j+1];			
						array[j+1] = (T) temp;
					}
				}
			}
			System.out.println("\nSorted Array :-  " + Arrays.toString(array));    
		}
		
		
		public static void main(String[] args) {
		
			
			Integer array[] = {10 , 25 , 90 , 15 , 30 , 55 , 125 , 75 , 5 , 11 , 67};
			System.out.println("Given Array :-  " + Arrays.toString(array));
			
			BubbleSortGeneric.bubbleSorting(array);        
		}

}
