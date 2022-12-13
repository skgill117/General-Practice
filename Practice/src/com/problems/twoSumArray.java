package com.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSumArray {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5};
		
		int [] result = twoSum(arr, 7);
		
		System.out.println(Arrays.toString(result));

	}

	private static int[] twoSum(int[] nums, int target) {
		int[] arr = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {

			int diff = target - nums[i];
			if (map.containsKey(diff)) {
				arr[0] = i;
				arr[1] = map.get(diff);
			} else {
				map.put(nums[i], i);
			}

		}

		return arr;

	}

}
