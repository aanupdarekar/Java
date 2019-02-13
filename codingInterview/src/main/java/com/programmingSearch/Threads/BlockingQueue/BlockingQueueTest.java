package com.programmingSearch.Threads.BlockingQueue;

import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {

	public static void main(String[] args) {
		try {

			BlockingQueue blockingqueue = new ArrayBlockingQueue<>(5);
			Producer producer = new Producer(blockingqueue);
			Consumable consumable = new Consumable(blockingqueue);

			new Thread(producer).start();
			//new Thread(producer).start();
			new Thread(consumable).start();

			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
