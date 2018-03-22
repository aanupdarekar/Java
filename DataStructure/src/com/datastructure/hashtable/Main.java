package com.datastructure.hashtable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashTable hashtable = new HashTable();
		Student std1 = new Student("Anup", "15-123", 3.4);
		Student std2 = new Student("Prer", "15-453", 3.1);
		Student std3 = new Student("Geet", "15-233", 3.2);
		Student std4 = new Student("Geeta", "15-321", 3.2); // Duplication is
															// resolved

		int std1key = hashtable.toHashCode(std1.getRollno());
		int std2key = hashtable.toHashCode(std2.getRollno());
		int std3key = hashtable.toHashCode(std3.getRollno());
		int std4key = hashtable.toHashCode(std4.getRollno());

		hashtable.insert(std1key, std1);
		hashtable.insert(std2key, std2);
		hashtable.insert(std3key, std3);
		hashtable.insert(std4key, std4);

	//	hashtable.deleteStd(std2.getRollno());

		hashtable.showData();

	}

}
