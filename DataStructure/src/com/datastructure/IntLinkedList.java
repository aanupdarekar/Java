  package com.datastructure;

/**
 * 
 * Adding item to front of the list
 * 
 * @author A3PHQZZ
 *
 */
public class IntLinkedList {

	public Node head;

	public IntLinkedList(int item) {
		head = new Node();
		head.value = item;
		head.link = null;

	}

	public boolean insertItem(int item) {
		Node n = new Node();
		n.value = item;
		n.link = head;
		head = n;
		return true;
	}

	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.println(n.value);
			n = n.link;
		}
	}

	public boolean deleteItem(int item) {
		if (head.value == item) {
			head = head.link;
			return true;
		} else {

			// reference for frist and second node. Second node for detecting
			// and first node for removing it
			Node x = head;
			Node y = head.link;
			while (true) {
				if (y == null || y.value == item) {
					break;
				} else {
					x = y;
					y = y.link;
				}
			}
			if (y != null) {
				x.link = y.link;
				return true;
			} else {
				return false;
			}
		}
	}

	class Node {
		public int value;
		public Node link;
	}
}
