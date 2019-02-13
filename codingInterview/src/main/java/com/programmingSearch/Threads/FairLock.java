package com.programmingSearch.Threads;

import java.util.ArrayList;
import java.util.List;

public class FairLock {

	/* Keeps track whether the lock is acquired or not */
	private boolean isLocked = false;

	/* Keeps track which thread hold the lock */
	private Thread lockHoldingThread = null;

	/* Keeps list of lock object,on which each thread wait */
	private List<LockObj> waitingThreadLockList = new ArrayList<LockObj>();

	/**
	 * Each thread calls this to get the lock. If the lock is already acquired
	 * by other,then it wait for it. Here the priority of getting lock is on
	 * FIFO (First In First Out) basis.
	 *
	 */
	public void lock() {

		LockObj lockObj = new LockObj();
		boolean isLockGranted = false;

		//add in list according to sequence
		synchronized (this) {
			System.out.println("Entered into queue: " + Thread.currentThread().getName());
			waitingThreadLockList.add(lockObj);
		}

		
		//Keep on looping till you exit the loop
		while (!isLockGranted) {
			synchronized (this) {
				System.out.println("********************************"+Thread.currentThread().getName());
				
				//check if its not locked or if its first thread
				isLockGranted = !isLocked && waitingThreadLockList.get(0) == lockObj; 
				if (isLockGranted) {
					
					//if its true then remove from list and lock it
					waitingThreadLockList.remove(0);
					lockHoldingThread = Thread.currentThread();
					isLocked = true;
					return;
				}
			}

			try {
				System.out.println("Start waiting " +Thread.currentThread().getName());
				lockObj.doWait(); // if some exception is there,remove that
			} catch (Exception e) {
				e.printStackTrace();
                waitingThreadLockList.remove(lockObj);
                System.out.println("exception ");
			} /*finally {
			}*/
		}

	}

	/**
	 * Each thread calls this method to release the lock and notifies the next thread
	 */
	public void release() {
		if (lockHoldingThread != Thread.currentThread()) {
			throw new RuntimeException("The thread has not got the lock yet");
		}
		System.out.println("Lock Released " +Thread.currentThread().getName());
		lockHoldingThread = null;
		isLocked = false;
		if (waitingThreadLockList.size() > 0) {
			waitingThreadLockList.get(0).doNotify();
		}

	}

	/**
	 * Each thread use this to wait on it. This class helps to implement a fair
	 * lock
	 *
	 */

	class LockObj {

		private boolean isNotified = false;

		/**
		 * Wait until some thread notifies
		 * 
		 * @throws InterruptedException
		 */
		public synchronized void doWait() throws InterruptedException {
			
			while (!isNotified) {
				wait();
			}
			isNotified = false;
		}

		/**
		 * notifies waiting thread
		 */
		public synchronized void doNotify() {
			notify();
			isNotified = true;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof LockObj && this == obj) {
				return true;
			}

			return false;
		}
	}
}