package com.problems;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int num = 121;
		int temp = num;
		
		int rem = 0;
		int rev = 0;
		
		while(num > 0) {
			
			rem = num % 10;
			rev = rev*10 + rem;
			num = num/10;
		}
		
		System.out.println(rev);
		
		if(temp == rev) {
			System.out.println("it is palindrome number");
		}else {
			System.out.println("not palidrome");
		}

	}

}
