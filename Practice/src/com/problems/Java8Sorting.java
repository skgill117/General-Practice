package com.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Sorting {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(4, 2, 24, 89, 45, 38);
		List<Integer> ascendingSort = list.stream().sorted().collect(Collectors.toList());
		List<Integer> decendingSort = list.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(ascendingSort);
		System.out.println(decendingSort);
		Integer min = list.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		Integer max = list.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(min);
		System.out.println(max);

	}

}
