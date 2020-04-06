package com.hsc.functionalInterface;

/**
 * This class consists of default and static methods in functional interface
 * 
 * @author puneet gupta
 * @since 06-Apr-2020
 */

interface interface1 {
	abstract void printName(String name);

	default void printCity(String city) {
		System.out.println(city);
	}
}

interface interface2 {
	abstract void printName(String name);

	default void printCity(String city) {
		System.out.println(city);
	}
}

public class DiamondProblemDefaultFunctionalInterface implements interface1, interface2 {
	public static void main(String[] args) {
		DiamondProblemDefaultFunctionalInterface dpd = new DiamondProblemDefaultFunctionalInterface();
		dpd.printName("abc");
		dpd.printCity("gurgaon");
	}

	/*
	 * This method is the result of diamond problem and we need to provide the
	 * implementation in the implementing class
	 */
	@Override
	public void printCity(String city) {
		// to call interface1 method
		interface1.super.printCity(city);
		// to call interface2 method
		interface2.super.printCity(city);
	}

	@Override
	public void printName(String name) {
		System.out.println(name);
	}
}
