package com.hsc.threads;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceUpdates {
	public static void main(String[] args) throws InterruptedException {

		// This method returns us the thread pool it acts as a wrapper above
		// fork join pool
		ExecutorService excr = Executors.newWorkStealingPool(4);
		ThreadPoolExecutor mypool = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		System.out.println("size of mypool: " + mypool.getPoolSize());
		excr.submit(new Threadimpl());
		excr.submit(new Threadimpl());
		System.out.println("Total number threads scheduled): " + mypool.getTaskCount());
		try {
			excr.invokeAll(null);
		} catch (Exception e1) {
			System.out.println("No callback function");
		}
		excr.shutdown();

		ExecutorService executor = Executors.newWorkStealingPool();

		List<Callable<Threadimpl>> callables = Arrays.asList(() -> new Threadimpl(), () -> new Threadimpl(),
				() -> new Threadimpl());

		executor.invokeAll(callables).stream().map(future -> {
			try {
				return future.get();
			} catch (Exception e) {
				throw new IllegalStateException(e);
			}
		}).forEach(System.out::println);

		executor.shutdown();
	}
}

class Threadimpl implements Runnable {

	public void run() {

		try {
			Long num = (long) (Math.random() / 30);
			System.out.println("Thread Name: " + Thread.currentThread().getName());
			TimeUnit.SECONDS.sleep(num);
			System.out.println("after sleep Thread Name: " + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
