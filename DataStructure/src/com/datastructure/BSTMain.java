package com.datastructure;

public class BSTMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p0 = new Person("Geeta");
		Person p1 = new Person("Anup");
		Person p2 = new Person("Prerana");
		Person p3 = new Person("Smita");
		Person p4 = new Person("Shalaka");
		Person p5 = new Person("Advi");

		BST bst = new BST();
		bst.insertItem(p0);
		bst.insertItem(p1);
		bst.insertItem(p2);
		bst.insertItem(p3);
		bst.insertItem(p4);
		bst.insertItem(p5);
		bst.showAll(bst.findNode("Geeta"), "Start");
		bst.findParent("Shalaka");

	
	}

}
