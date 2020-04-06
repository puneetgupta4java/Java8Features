package com.hsc.lambda;

/**
 * This class consists of basic lambda expression usage in Java8
 * 
 * @author puneet gupta
 * @since 06-Apr-2020
 */
public class BasicLambdaSample {

	public static void main(String[] args) {

		// Previous implementation using anonymous class
		Runnable runnable1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("from anonymous class");
			}
		};

		// Lambda expression is normally used to do shorthand
		Runnable runnable2 = () -> System.out.println("From lambda expression");

		new Thread(runnable1).start();
		new Thread(runnable2).start();

		// We can directly provide implementation at the usage time
		new Thread(() -> System.out.println("From runtime lambda expression")).start();
	}

}
