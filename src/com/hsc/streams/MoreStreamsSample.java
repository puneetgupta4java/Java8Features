package com.hsc.streams;

import java.util.Arrays;
import java.util.List;

/**
 * This class consists of streams API functions usage
 * 
 * @author puneet gupta
 * @since 06-Apr-2020
 */
public class MoreStreamsSample {

	public static void main(String[] args) {
		String[] names = { "abc", "pqr", "mno", "xyz", "mno", "xyz" };
		List<String> list = Arrays.asList(names);
		// Using these methods we eliminate the duplicates and sort them in
		// natural order
		list.stream().distinct().sorted().forEach(System.out::println);
		System.out.println("\n\nNow parallel stream");
		// Using parallel stream we enable parallel streaming of list
		list.parallelStream().forEach(System.out::println);
		System.out.println("checks for whether all elements starts with x or p");
		System.out.println(list.stream().allMatch(x -> x.startsWith("x") || x.startsWith("p")));
		System.out.println("checks for whether any element starts with x or p");
		System.out.println(list.stream().anyMatch(x -> x.startsWith("x") || x.startsWith("p")));

		System.out.println("Number of elements in list " + list.stream().count());
	}

}
