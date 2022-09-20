package com.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayMaxProfit {

	public static void main(String[] args) {
		
		int [] arr = {4, 5, 1, 83, 47, 103, 45};;
		
		int[] twoSum = findTwoSum(arr, 186);
		System.out.println(Arrays.toString(twoSum));
		

	}

	private static int [] findTwoSum(int[] arr, int target) {
		int [] array = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++) {
			int diff = target - arr[i];
			if(map.containsKey(diff)) {
				array[0] = i;
				array[1] = map.get(diff);
			}else {
				map.put(arr[i], i);
			}
		}
		
		return array;
		
	}
	
    

}
