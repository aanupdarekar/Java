package com.datastructure.hashtable;

public class StdList {

	private Node h;

	public StdList() {
		h = new Node();
		h.data = null;
		h.next = null;
	}

	/**
	 * Adding data at start of list
	 * */
	public boolean insertStd(Student std) {
		if(!haveRollno(std.getRollno())) {
			Node n = new Node();
			n.data = std;
			n.next = h.next;
			h.next = n;
			return true;
		}
		System.out.println("Roll NO is taken");
		return false;
	}

	/**
	 * Check if student existed using roll number
	 * **/
	public boolean haveRollno(String rollno) {
		Node a = h.next;
		boolean have = false;
		while (a != null) {
			if (rollno.equals(a.data.getRollno())) {
				have = true;
				break; //I wrote this
			}
			a = a.next;
		}
		return have;
	}

	/**
	 * Fetch student
	 * **/
	public Student fetchData(String rollno) {
		Student data = null;
		Node p = h.next;
		while (p != null) {
			if (p.data.getRollno().equals(rollno)) {
				data = p.data;
				break;
			}
			p = p.next;
		}
		return data;

	}

	/**
	 * Delete student
	 * **/
	public void deleteStudent(String rollno) {

		Node p = h;
		Node q = h.next;

		//check if q is not empty and roll number is not equal
		while (q != null && !(q.data.getRollno().equals(rollno))) {
			p = q;
			p = q.next;
		}
		
		//once data found 
		if (q != null) {
			p.next = q.next;

		} else {
			// no data found
		}
	}

	public void showAll() {
		Node x = h.next;
		while (x != null) {
			System.out.println(x.data);
			x = x.next;

		}
	}

	class Node {
		private Student data;
		private Node next;
	}
}
