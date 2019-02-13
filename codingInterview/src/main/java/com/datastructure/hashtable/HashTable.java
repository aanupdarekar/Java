package com.datastructure.hashtable;

/**Hashtable will divide the asci code with length of array and whatever you get in modulus the result will show that in that index
 * a=97%5 =2
 * So now the a will be stored in second index
 * THis is created using array with reference to linked list
 * Hashtabl works with Array
 * */
public class HashTable {

	private StdList[] arr;
	private int size;
	private int totalstudents;

	public HashTable() {
		size = 1000;
		arr = new StdList[size];

	}

	/**
	 * Convert roll number into hashcode and use it as index
	 * **/
	public int toHashCode(String rollno) {
		int addasciis = 0;
		int codevalue = 0;
		for (int i = 0; i < rollno.length(); i++) {
			
			//convert individual character into asci and add it 
			addasciis = addasciis + (int) rollno.charAt(i);
		}
		
		// Take the modulus to find the array postion
		codevalue = addasciis % arr.length;
		return codevalue;
	}

	public boolean insert(int key, Student data) {
		
		//check if particualar index of array is empty
		if (arr[key] == null) {
			
			arr[key] = new StdList();

		}
		arr[key].insertStd(data);
		totalstudents++;
		return true;
	}

	public int getTotal() {
		return totalstudents;
	}

	/**
	 * Fetch student information
	 * **/
	public Student fetchStdInfor(String rollno) {
		int key = toHashCode(rollno);
		if (arr[key] == null) {
			return null;
		} else {
			Student q = arr[key].fetchData(rollno);
			if (q != null) {
				return q;
			} else {
				return null;
			}
		}

	}

	public boolean deleteStd(String rollno) {

		int key = toHashCode(rollno);
		boolean have = arr[key].haveRollno(rollno);
		if (have) {
			arr[key].deleteStudent(rollno);
			totalstudents--;
			return true;
		}
		return false;

	}

	public void showData() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				arr[i].showAll();

			}
		}
	}

}
