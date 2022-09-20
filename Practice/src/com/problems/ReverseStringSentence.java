package com.problems;

public class ReverseStringSentence {

	public static void main(String[] args) {
		
		String s = "welcome to java world";
		
		String [] arr = s.split(" ");
		
		for(String st : arr) {
			
			System.out.print(reverseString(st) + " ");
		}

	}

	private static String reverseString(String s) {
		StringBuffer sb = new StringBuffer();
        char [] arr = s.toCharArray();
		
		
		for(int i = arr.length-1; i >= 0; i--) {
			
			sb.append(arr[i]);
			
			
		}
		
		return sb.toString();
	}

}
