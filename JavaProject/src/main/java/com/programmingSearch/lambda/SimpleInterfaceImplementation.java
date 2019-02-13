package com.programmingSearch.lambda;

public class SimpleInterfaceImplementation {

	public static void main(String[] args) {
		//Simple implementation
		SimpleInterface sI = () -> System.out.println("How are you");
		sI.doSomething();
	}

}
