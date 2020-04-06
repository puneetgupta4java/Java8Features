package com.hsc.streams;

import java.util.Arrays;
import java.util.List;

/**
 * This class consists of streams API map function usage
 * 
 * @author puneet gupta
 * @since 06-Apr-2020
 */
public class MapSample {

	public static void main(String[] args) {
		Integer[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> list = Arrays.asList(nums);
		
		// Increment every value in list by 1
		list.stream().map(x->x+1).forEach(System.out::println);
	}

}
