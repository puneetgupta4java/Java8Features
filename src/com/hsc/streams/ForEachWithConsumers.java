package com.hsc.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * This class consists of demonstration of use of consumer with forEach
 * 
 * @author puneet gupta
 * @since 06-Apr-2020
 */
public class ForEachWithConsumers {
	public static void main(String[] args) {
		String[] names = { "abc", "pqr", "xyz" };
		List<String> list = Arrays.asList(names);
		list.forEach(new MyConsumer());

		System.out.println("updated consumer using lambda expression");
		// We can also provide consumer implementation using lambda expression
		// at the runtime
		list.forEach(x -> System.out.println(x));

		System.out.println("Using consumer shorthand");
		list.forEach(System.out::println);
	}
}

class MyConsumer implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
	}

}
