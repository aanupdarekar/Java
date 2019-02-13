package com.programmingSearch.Threads;

class LockObj {

    private boolean isNotified = false;

    /**
     * Wait until some thread notifies
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
