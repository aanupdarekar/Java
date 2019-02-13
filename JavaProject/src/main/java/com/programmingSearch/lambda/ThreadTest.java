package com.programmingSearch.lambda;

public class ThreadTest {

	public static void main(String[] args) {
		Runnable task = () -> {
		    String threadName = Thread.currentThread().getName();
		    System.out.println("Hello " + threadName);
		};
		task.run();
		
		Thread thread = new Thread(task);
		thread.start();

		System.out.println("Done!");

	}

}
