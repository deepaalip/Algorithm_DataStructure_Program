package com.bridgelabz.algorithm;

import java.util.Arrays;

public class InsertionSortGeneric <T extends Comparable<T>>{
	public static <T extends Comparable<T>> void insertion_sorting(T[] array) {
		for(Integer i = 1; i < array.length; i++) {
			T key = array[i];               
			Integer index = i - 1;
			while(index >= 0) {
				if(key.compareTo(array[index]) > 0) {
					break;
				}
				array[index + 1] = array[index];       
				index--;
			}
			array[index + 1] = key;           
		}
		System.out.println("\nSorted Array :-  " + Arrays.toString(array));
	}
	

	public static void main(String[] args) {
	
	
		
		String array[] = {"E","D","C","B","A","Z","U","X","G"};
		System.out.println("Given Array :-  " + Arrays.toString(array));
		
		InsertionSortGeneric.insertion_sorting(array);  
	}

}
