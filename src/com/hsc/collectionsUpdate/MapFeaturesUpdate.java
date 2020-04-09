package com.hsc.collectionsUpdate;

import java.util.HashMap;

public class MapFeaturesUpdate {

	public static void main(String[] args) {

		HashMap<Integer, String> hs = new HashMap<>();
		hs.put(1, "a");
		hs.put(2, "b");
		hs.put(3, "c");
		hs.put(4, "d");
		hs.put(5, "e");

		// This function is used to perform bulk operation on all the values
		// present in a map
		hs.replaceAll((key, value) -> "abc");
		System.out.println(hs);

		// If you want to update particular value in a map then we have to use
		// compute function of map API
		hs.compute(2, (k, v) -> "I am updated");
		System.out.println(hs);

		// We can also perform some computation in the compute function
		hs.compute(3, (k, v) -> (v.length() == 3) ? "I am computed" : "Not");
		System.out.println(hs);

		HashMap<Integer, String> hs2 = new HashMap<>();
		hs2.put(1, "a1");
		hs2.put(2, "b1");
		hs2.put(3, "c1");

		// Merge is a new function which came in JAVA 8 for merging of two
		// hashmaps by putting a logic to manage values on the basis of collided
		// keys
		hs2.forEach((key1, value1) -> {
			hs.merge(key1, value1, (v1, v2) -> v1 + ", " + v2);
		});
		System.out.println(hs);

	}

}
