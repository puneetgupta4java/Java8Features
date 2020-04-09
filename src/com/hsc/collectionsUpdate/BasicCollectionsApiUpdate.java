package com.hsc.collectionsUpdate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;

public class BasicCollectionsApiUpdate {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>(Arrays.asList("abc", "def", "mno", "pqr", "xyz", "a"));

		// Iterator update in JAVA 8
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			// forEachRemaining method takes consumer as input
			iterator.forEachRemaining(x -> System.out.println(x + "update"));
		}

		// Removeif new default method of collection
		list.removeIf(x -> x.length()<3);
		System.out.println(list);
		
		System.out.println("\nSpliterator");
		// splititerator for parallel processing
		Spliterator<String> iterator2 = list.spliterator();
		Spliterator<String> iterator3 = iterator2.trySplit();
		iterator2.forEachRemaining(System.out::println);
		System.out.println("********************");
		iterator3.forEachRemaining(System.out::println);
		
	}

}

