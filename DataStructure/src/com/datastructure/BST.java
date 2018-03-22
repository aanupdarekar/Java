package com.datastructure;

public class BST {
	
	public class Node {
		public Node lc;
		public Node rc;
		public Person data;
	}
	
	public Node root;

	public BST() {
		root = null;
	}

	public boolean insertItem(Person item) {
		Node n = new Node();
		n.lc = null;
		n.rc = null;
		n.data = item;
		if (root == null) {
			root = n;
			return true;
		}
		Node p = root;
		Node c = root;
		while (c != null) {
			p = c;
			if (item.getName().compareTo(c.data.getName()) < 0) {
				c = c.lc;
			} else {
				c = c.rc;
			}
		}
		if (item.getName().compareTo(p.data.getName()) < 0) {
			p.lc = n;
		} else {
			p.rc = n;
		}
		return true;
	}

	// iterate throw all nodes
	public void showAll(Node n, String key) {
		Node p = n;
		if (p != null) {
			System.out.println(key + " " + p.data);
			showAll(p.lc, "LeftChild");
			showAll(p.rc, "RightChild");
		}

	}

	public Node findNode(String key) {
		Node c = root;
		while (c != null) {
			if (key.compareTo(c.data.getName()) == 0) {
				break;
			}
			if (key.compareTo(c.data.getName()) < 0) {
				c = c.lc;
			} else {
				c = c.rc;
			}
		}
		return c;
	}

	public Node findParent(String key) {
		Node p = root;
		Node c = root;
		while (c != null) {
			if (key.compareTo(c.data.getName()) == 0) {
				break;
			}
			p = c;
			if (key.compareTo(c.data.getName()) < 0) {
				c = c.lc;
			} else {
				c = c.rc;
			}
		}
		System.out.println(p.data.getName());
		if (c != null) {
			return p;
		} else {
			return null;
		}
	}

	
}
