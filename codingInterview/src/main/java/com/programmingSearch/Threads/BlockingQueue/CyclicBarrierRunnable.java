package com.programmingSearch.Threads.BlockingQueue;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierRunnable implements Runnable {

	

	CyclicBarrier barrier1 = null;
    CyclicBarrier barrier2 = null;

    public CyclicBarrierRunnable(
            CyclicBarrier barrier1,
            CyclicBarrier barrier2) {

        this.barrier1 = barrier1;
        this.barrier2 = barrier2;
    }
	@Override
	public void run() {
		try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() +
                                " waiting at barrier 1");
            this.barrier1.await();

            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() +
                                " waiting at barrier 2");
            this.barrier2.await();

            System.out.println(Thread.currentThread().getName() +
                                " done!");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
		
	}

	public static void main(String[] args) {
		CyclicBarrier barrier1 = new CyclicBarrier(2, () ->{
			 System.out.println("BarrierAction 1 executed ");
		});
		
		CyclicBarrier barrier2 = new CyclicBarrier(2, () ->{
			 System.out.println("BarrierAction 2 executed ");
		});

		
		CyclicBarrierRunnable barrierRunnable1 =
		        new CyclicBarrierRunnable(barrier1, barrier2);
		new Thread(barrierRunnable1).start();
		new Thread(barrierRunnable1).start();
		
		
	}
}
