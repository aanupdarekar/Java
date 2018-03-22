package com.datastructure.test;

import com.datastructure.dList;

public class dListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dList dlist = new dList(2);
		dlist.insertItem(4);
		dlist.insertItem(6);
		dlist.printList();
		dlist.deleteItem(4);
		dlist.printList();
	}

}
