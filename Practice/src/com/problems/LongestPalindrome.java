package com.problems;

public class LongestPalindrome {

	public static void main(String[] args) {
		
		String s = "shecejdunmadamkfkf";
		
		String palindrome = "";
		int maxSize = 0;
		if(s.length() < 2) {
			System.out.println(s);
		}
		for(int i = 0; i < s.length(); i++) {
			for(int j = i+1; j < s.length(); j ++) {
				String subString = s.substring(i, j);
				int palindromeSize = getPalindromeSize(subString);
				if(palindromeSize > maxSize) {
					maxSize = palindromeSize;
					palindrome = subString;
				}
			}
		}
		
		System.out.println(palindrome);

	}

	private static int getPalindromeSize(String subString) {
		boolean palindrome = false;
		StringBuffer sb = new StringBuffer(subString);
		if(subString.equals(sb.reverse().toString()))
			palindrome = true;
		return (palindrome == true ? subString.length() : 0);
	}

}
