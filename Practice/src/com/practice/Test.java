package com.practice;

public class Test {
	

	public static void main(String args[]) {
		   int n = 1000;
		  for(int i = 1; i <= n; i++){
		    System.out.print(fibonacci(i) +" ");
		  }
		}

		public static int fibonacci(int number) {
		  if (number == 1 || number == 2) {
		    return 1;
		  }
		  return fibonacci(number - 1) + fibonacci(number - 2);
		}

}
