package com.datastructure;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStack i = new IntStack();
		if (!i.isFull()) {

			i.push(2);
			i.push(4);
			i.push(6);
			i.push(9);
			i.push(7);
		}
		System.out.println(i.pop());

		System.out.println("Queue Algorithm");
		
		Intq q = new Intq();
		q.enqueue(2);
		q.enqueue(4);
		q.enqueue(6);
		q.showAll();
		
		System.out.println("IntLinkedList Algorithm");
		IntLinkedList list =new IntLinkedList(2);
		list.insertItem(5);
		list.insertItem(8);
		
		list.printList();
		
		System.out.println("IntLinkedListEnd Algorithm");
		IntLinkedListEnd listEnd =new IntLinkedListEnd(2);
		listEnd.insertItem(5);
		listEnd.insertItem(8);
		
		listEnd.printList();
		
		System.out.println("IntLinkedListWithoutConstructor Algorithm");
		IntLinkedListNoConst listNoCont =new IntLinkedListNoConst();
		listNoCont.insertItem(5);
		listNoCont.insertItem(2);
		listNoCont.insertItem(8);
		
		listNoCont.printList();
		listNoCont.sortList();
		System.out.println("IntLinkedListWithoutConstructor Sorted");
		listNoCont.printList();
	}

}
