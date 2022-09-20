package com.problems;

import java.util.Arrays;

public class Java8Array {

	public static void main(String[] args) {
		
		int [] arr = {7,3,8,55,25,98,46,26,95,38,29,36};
		
		Arrays.stream(arr).filter(x -> x % 2 == 0).forEach(x -> System.out.print(x + " "));

	}

}
