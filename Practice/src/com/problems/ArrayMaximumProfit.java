package com.problems;

public class ArrayMaximumProfit {

	public static void main(String[] args) {
		
		int[] arr = {4, 5, 1, 83, 47, 103, 45};
		
		
		int maxProfit = 0;
		int minSoFar = arr[0];
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] < minSoFar) {
				minSoFar = arr[i];
			}
			
			int currentProfit = arr[i] - minSoFar;
			
			if(currentProfit > maxProfit) {
				maxProfit = currentProfit;
			}
		}
		
		System.out.println(maxProfit);

	}

}
