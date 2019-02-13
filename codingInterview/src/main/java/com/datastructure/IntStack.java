package com.datastructure;

public class IntStack {

	private int stack[];
	private int top;
	private int size;

	public IntStack() {
		top = -1;
		size = 50;
		stack = new int[size];
	}

	public IntStack(int size) {
		top = -1;
		this.size = size;
		stack = new int[this.size];
	}

	public boolean push(int item) {
		if (!isFull()) {
			top++;
			stack[top] = item;
			return true;
		} else {
			return false;
		}
	}

	public int pop() {
		return stack[top--];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return (top == stack.length - 1);
	}
}
