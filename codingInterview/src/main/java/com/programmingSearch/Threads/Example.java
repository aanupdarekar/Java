package com.programmingSearch.Threads;

public class Example {
	public static void main(String[] args) {
		Counter counter1 = new Counter();
		Counter counter2 = new Counter();
		Thread threadA = new CounterThread(counter1);
		Thread threadB = new CounterThread(counter2);

		threadA.start();
		threadB.start();
	}
}
