package com.hsc.functionalInterface;

/**
 * This class consists of basic functional interface usage in Java8
 * 
 * @author puneet gupta
 * @since 06-Apr-2020
 */
@FunctionalInterface
interface FuncInterface1 {
	abstract int operation(int x, int y);
}

public class BasicFunctionalInterface {

	public static void main(String[] args) {
		FuncInterface1 funcInterfaceadd = (x, y) -> x + y;

		int sum = funcInterfaceadd.operation(1, 2);
		System.out.println("Sum of two numbers is "+sum);

		FuncInterface1 funcInterfaceMultiply = (x, y) -> x * y;

		int multiply = funcInterfaceMultiply.operation(1, 2);
		System.out.println("Mupltiplication of two numbers is " + multiply);
	}

}
