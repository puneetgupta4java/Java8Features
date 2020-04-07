package com.hsc.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinAndMaxFunctionMap {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(-19, -8, 0, 51, 4);

		// Max function is use to find max element on the basis of input
		// comparator function
		System.out.println(list.stream().max(Integer::compare).get());

		// Similarly Min function is use to find minimum element on the input
		// comparator function
		System.out.println(list.stream().min(Comparator.naturalOrder()).get());
	}
}
