package com.programmingSearch.Threads;

public class Consumable {

    FairLock practice= null;
    
   // FairLockPractice practice = null;
    int i= 0;

    public Consumable() {
    	practice= new FairLock();
      //  practice = new FairLockPractice();
    }

    public void consumeLikeAnything() {
        System.out.println("Current Thread: "+ Thread.currentThread().getName());

        practice.lock();

        System.out.println(Thread.currentThread().getName() + " is consuming and processing : "+ ++i);

        practice.release();
    }
}