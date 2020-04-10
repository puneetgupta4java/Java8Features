package com.hsc.collectionsUpdate;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrencyApiUpdate {
	public static void main(String[] args) {

		ConcurrentHashMap<Integer, String> hs = new ConcurrentHashMap<>();
		hs.put(1, "a");
		hs.put(2, "b");
		hs.put(3, "c");
		hs.put(4, "d");
		hs.put(5, "e");

		// We can now perform all operations on concurrenthashmap more
		// efficiently than synchronized map with by default thread safe
		// property because it internally uses hash table

		// If you want to update particular value in a map then we have to use
		// compute function of map API
		hs.compute(2, (k, v) -> "I am updated");
		System.out.println(hs);

		// We can also perform some computation in the compute function
		hs.compute(3, (k, v) -> (v.length() != 3) ? "I am computed" : "I am not computed");
		System.out.println(hs);

		// As in concurrenthashmap number of mappings may be different from its
		// size in int
		System.out.println("Number of mapping in concurrent hash map " + hs.mappingCount());

	}
}
