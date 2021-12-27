package com.bridgelabz.algorithm;

public class MergeSortGenerics<T>{

	public static void merge(int arr[],int lo,int hi,int mid){ 
		int merged[] = new int [hi - lo +1];
		int index1 = lo;
		int index2 = mid + 1;
		int x = 0;
		
		while (index1 <= mid && index2<= hi) {
			if (arr[index1] <= arr[index2]) {
				merged[x++]= arr[index1++];
			}
			else {
				merged[x++]= arr[index2++];
			}
		}
		
		   while (index1 <= mid) {
			   merged[x++]= arr[index1++];
		   }
		   
		   while (index2 <= hi) {
			   merged[x++]= arr[index2++];
		   }
		   
		 
		   for (int i=0, j=lo; i<=merged.length ; i++ , j++) {
			   arr [j] = merged[i];
		   }
		   
	}
	public static void divide(int arr[],int lo,int hi){
		if(lo >= hi) {
			return;
		}
		
		int mid = lo +(hi -lo)/2;
		divide(arr , lo, mid);
		divide(arr , mid+1,hi);
		merge(arr,lo,mid,hi);
	}
	
	public static void main(String[] args) {
		int arr [] = {4,7,9,2,5,8};
		int n = arr.length;
		
		divide(arr,0,n-1);
		
		for(int i=0; i<n;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		
		
	}
	
	
}
