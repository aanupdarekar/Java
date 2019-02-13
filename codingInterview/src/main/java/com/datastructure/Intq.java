package com.datastructure;

/**
 * Class for queue 
 * FIFOs
 * 
 * **/
public class Intq {

	public int[] q;
	public int size;
	public int front;
	public int total;
	public int rear;

	public Intq() {
		size = 2;
		total = 0;
		front = 0;
		rear = 0;
		q = new int[2];
	}

	public Intq(int size) {
		this.size = size;
		total = 0;
		front = 0;
		rear = 0;
		q = new int[this.size];
	}

	public boolean enqueue(int item) {
		if (isFull()) {
			return false;
		} else {
			total++;
			q[rear] = item;
			rear = (rear + 1) % size;
			return true;
		}
	}

	public int dequeue() {
		int item = q[front];
		total--;
		//front++
		front = (front + 1) % size;
		return item;
	}

	public void showAll() {
		int f = front;
		if (total != 0) {
			for (int i = 0; i < total; i++) {
				System.out.println(" " + q[f]);
				f = (f + 1) % size;
			}
		}
	}

	public boolean isFull() {
		if (size == total) {
			return true;
		} else {
			return false;
		}
	}
}
