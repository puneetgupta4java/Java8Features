package com.hsc.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVsFlatMap {

	public static void main(String[] args) {

		List<String> items1 = Arrays.asList("abcabc", "pqrpqr");
		List<String> items2 = Arrays.asList("mnomno", "xyzxyz");
		List<List<String>> items3 = Arrays.asList(items1, items2);
		System.out.println("Using simple map they didn't get flattened and remain in 2D format");
		// Using simple map remove distinct variables
		List<Stream<String>> items4 = items3.stream().map(Collection::stream).collect(Collectors.toList());
		items4.forEach(x -> x.forEach(System.out::println));

		System.out.println("\n\nUsing flatmap");
		// Using flat map remove distinct variables
		List<String> items5 = items3.stream().flatMap(Collection::stream).collect(Collectors.toList());
		System.out.println(items5);
	}

}
