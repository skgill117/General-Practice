package com.problems;

public class MinimumBagProblem {

	public static void main(String[] args) {
		
		int n = findMinimumBag(23,3,2);
		System.out.println(n);
		
		

	}

	private static int findMinimumBag(int noOfItems, int largeBagCapacity, int smallBagCapacity) {
		
		if(noOfItems < 1)
			return -1;
		
		int requiredTotalBags = 0;
		
		if(largeBagCapacity > 0) {
			int largeBags = noOfItems/largeBagCapacity;
			int remainingItems = noOfItems%largeBagCapacity;
			requiredTotalBags = requiredTotalBags + largeBags;
			if(remainingItems > 0) {
				if(smallBagCapacity > 0) {
					int smallBags = remainingItems/smallBagCapacity;
					int furtherRemainingItems = remainingItems % smallBagCapacity;
					requiredTotalBags = requiredTotalBags + smallBags;
					if(furtherRemainingItems > 0) {
						requiredTotalBags =  -1;
					}
				}else {
					requiredTotalBags = -1;
				}
				
			}
		}else {
			if(smallBagCapacity > 0) {
				int smallBags = noOfItems/smallBagCapacity;
				int remainingItems = noOfItems%smallBagCapacity;
				requiredTotalBags = requiredTotalBags + smallBags;
				if(remainingItems > 0) {
					requiredTotalBags = -1;
				}
			}else {
				requiredTotalBags = -1;
			}
		}
		
		
		return requiredTotalBags;
	}

}
