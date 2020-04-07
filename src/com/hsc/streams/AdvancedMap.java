package com.hsc.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class AdvancedMap {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("abjbjc", "nb b pqr", "mnkjjno", "xy z", "mnohk", "hujjm mxyz");

		// We can directly convert the value of list to uppercase
		list.stream().map(String::toUpperCase).forEach(System.out::println);

		System.out.println("\n\nUsing simple map function");
		// displaying the length of each String
		list.stream().map(str -> str.length()).forEach(System.out::println);
		System.out.println("\n\nNow using flatmaptoint function");
		// we can do similar operation using flatmaptoint the only difference is
		// this method returns a stream of all the converted input while map
		// returns us values one by one on the basis of input
		list.stream().flatMapToInt(str -> IntStream.of(str.length())).forEach(System.out::println);

	}

}
