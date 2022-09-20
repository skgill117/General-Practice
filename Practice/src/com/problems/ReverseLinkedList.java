package com.problems;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ReverseLinkedList {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		ListIterator<Integer> itr = list.listIterator(list.size());
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}

}
