package com.hsc.functionalInterface;

/**
 * This class consists of default and static methods in functional interface
 * 
 * @author puneet gupta
 * @since 06-Apr-2020
 */
@FunctionalInterface
interface FuncInterface {

	abstract void printName(String name);

	default void printCity(String city) {
		System.out.println(city);
	}

	static void printAge(int age) {
		System.out.println(age);
	}
}

public class DefaultAndStaticMethodDemo {

	public static void main(String[] args) {
		FuncInterface func = name -> System.out.println(name);

		func.printName("puneet");
		func.printCity("gurgaon");
		FuncInterface.printAge(22);
	}
}
