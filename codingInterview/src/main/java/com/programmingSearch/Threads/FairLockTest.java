package com.programmingSearch.Threads;

public class FairLockTest {

	 public static void main(String[] args) {
	        FairLockTest test = new FairLockTest();
	        Consumable consumable = new Consumable();

	     
	        Thread A = new MyThread(consumable);
	        A.setName("Thread A");
	        A.start();
	        
	        Thread B = new MyThread(consumable);
	        B.setName("Thread B");
	        B.start();
	        
	        Thread C = new MyThread(consumable);
	        C.setName("Thread C");
	        C.start();
	        
	        Thread D = new MyThread(consumable);
	        D.setName("Thread D");
	        D.start();
	        
	      /*  
	        (new MyThread(consumable)).start();
	        (new MyThread(consumable)).start();
	        (new MyThread(consumable)).start();
	        */


	    }


	    static class MyThread extends Thread {

	        private Consumable consumable;

	        public MyThread(Consumable consumable) {
	            this.consumable = consumable;
	        }

	        @Override
	        public void run() {
	            super.run();
	            consumable.consumeLikeAnything();
	       }
	    }

	}