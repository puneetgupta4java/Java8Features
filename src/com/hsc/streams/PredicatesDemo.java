package com.hsc.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * This class consists of demonstration of use of predicates
 * 
 * @author puneet gupta
 * @since 06-Apr-2020
 */
public class PredicatesDemo {
	public static void main(String[] args) {
		System.out.println(
				"Predicates are the simple methods which returns boolean value on the basis of precondition and input parameter");
		Integer[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> list = Arrays.asList(numbers);
		Predicate<Integer> predicate = new Predicate<Integer>() {
			@Override
			public boolean test(Integer x) {
				if (x > 5)
					return true;
				return false;
			}
		};
		List<Integer> updatedList = list.stream().filter(predicate).collect(Collectors.toList());
		System.out.println(updatedList);
		System.out.println("Predicate using lambda expression");
		list.stream().filter(x -> x > 5).forEach(System.out::println);
		System.out.println("Shorthand for predicate for using any predefined methods");
		list.stream().filter(PredicatesDemo::isLessThanFive).forEach(System.out::println);
	}
	
	public static boolean isLessThanFive(int x){
		if (x <= 5)
			return true;
		return false;
	}
}
