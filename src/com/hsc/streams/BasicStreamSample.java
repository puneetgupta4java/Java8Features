package com.hsc.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class consists of basic stream API usage in Java8
 * 
 * @author puneet gupta
 * @since 06-Apr-2020
 */
public class BasicStreamSample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		// Here we are using streams, forEach and consumers in a single
		// statement
		list.stream().forEach(System.out::println);

		// Here we are using stream,, filters and again collect it in the same
		// list
		list = list.stream().filter(x -> x > 2).collect(Collectors.toList());
		System.out.println("\n\nList after filter");
		list.forEach(System.out::println);
	}

}
