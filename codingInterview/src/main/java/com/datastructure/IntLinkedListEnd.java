package com.datastructure;

/**
 * 
 * Adding item to end of the list
 * Change has to be done in insertItem
 * 
 * @author A3PHQZZ
 *
 */
public class IntLinkedListEnd {

	public Node head;

	public IntLinkedListEnd(int item) {
		head = new Node();
		head.value = item;
		head.link = null;

	}

	public boolean insertItem(int item) {
		Node n = new Node();
		n.value = item;
		n.link = null;

		Node z = head;
		while (z.link != null) {
			z = z.link;
		}
		z.link = n;
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
			Node x = head;
			Node y = head;
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
