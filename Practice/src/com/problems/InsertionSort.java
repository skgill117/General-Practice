package com.problems;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int [] arr = {3,6,8,55,23,17,1,2,68,43};
		System.out.println(Arrays.toString(arr));
		int[] sortedArray = insertionSort(arr);
		System.out.println(Arrays.toString(sortedArray));

	}

	private static int[] insertionSort(int[] arr) {
		
		for(int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			
			int j = i;
			while(j > 0 && arr[j-1] >= temp) {
				
				arr[j] = arr[j-1];
				
				j--;
			}
			
			arr[j] = temp;
		}
		
		
		return arr;
	}

}
