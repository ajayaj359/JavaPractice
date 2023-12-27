package com.datastructures;

import java.util.Arrays;

public class selectionSort {

	public static void numberSort() {
		int[] arr= {64,34,25,12,22,11,90};
		selectionSort(arr);
		Arrays.stream(arr).forEach(i-> System.out.println(i));
	}
	
	
	
	private static void selectionSort(int[] arr) {
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			int minIndx=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[minIndx])
					minIndx=j;
			}
			int temp=arr[minIndx];
			arr[minIndx]=arr[i];
			arr[i]=temp;
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		numberSort();
	}

}
