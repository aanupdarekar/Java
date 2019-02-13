package com.datastructure;

/**
 * 
 * Doubly linked List 
 * 
 * @author A3PHQZZ
 *
 */
public class dList {

	public Node head;

	//initialize the value
	public dList(int item) {
		head = new Node();
		head.value = item;
		head.prev= null;
		head.next = null;

	}

	/**
	 * Insert an item at start of list
	 * @param item
	 * @return
	 */
	public boolean insertItem(int item) {
		Node n = new Node();
		n.value = item;
		n.prev=null;
		head.prev=n;
		n.next = head;
		head = n;
		return true;
	}
	
	public boolean insertEndOfList(int item) {
		
		Node n= new Node();
		n.next=null;
		n.value=item;
		
		Node z =head;
		while(z.next !=null) {
			z = z.next;
		}
		z.next = n;
		n.prev =z;
				
		return true;
	}

	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.println(n.value);
			n = n.next;
		}
	}

	public boolean deleteItem(int item) {
		if (head.value == item) {
			head = head.next;
			return true;
		} else {
			Node x = head;
			Node y = head;
			while (true) {
				if (y == null || y.value == item) {
					break;
				} else {
					x = y;
					y = y.next;
				}
			}
			if (y != null) {
				x.next = y.next;
				return true;
			} else {
				return false;
			}
		}
	}


	class Node {
		public int value;
		public Node next;
		public Node prev;
	}
}
