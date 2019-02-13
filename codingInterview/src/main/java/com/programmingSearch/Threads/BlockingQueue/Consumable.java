package com.programmingSearch.Threads.BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumable implements Runnable{

	private BlockingQueue queue;
	public Consumable(BlockingQueue queue){
		
		this.queue = queue;
	}
	@Override
	public void run() {
		try {
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}
