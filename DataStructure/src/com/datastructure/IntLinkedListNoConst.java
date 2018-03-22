package com.datastructure;

/**
 * 
 * No constructor change head to head.value
 * 
 * @author A3PHQZZ
 *
 */
public class IntLinkedListNoConst {

	public Node head;

	public IntLinkedListNoConst() {
		head = new Node();
		head.value = 0;
		head.link = null;

	}

	public boolean insertItem(int item) {
		Node n = new Node();
		n.value = item;
		n.link = head.link;
		head.link = n;
		return true;
	}

	public void printList() {
		Node n = head.link;
		while (n != null) {
			System.out.println(n.value);
			n = n.link;
		}
	}

	public boolean deleteItem(int item) {
		if (head.link.value == item) {
			head.link = head.link;
			return true;
		} else {
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

	/**
	 * Sort in descending order
	 * */
	public void sortList() {
		int c = 0;
		
		//Take the head
		Node a = head.link;
		
		//if its null exit
		while (a.link != null) {
			Node b = head.link;
			while (b.link != null) {
				if (b.value < b.link.value) {
					c = b.value;
					b.value = b.link.value;
					b.link.value = c;
				}
				b=b.link;
			}
			a=a.link;
		}
	}

	class Node {
		public int value;
		public Node link;
	}
}
