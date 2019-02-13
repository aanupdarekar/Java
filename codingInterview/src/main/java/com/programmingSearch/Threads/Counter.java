package com.programmingSearch.Threads;

public class Counter {
	public long count = 0;

	public synchronized void add(long value) {
		this.count += value;
		System.out.println(this.count);
	}
}
