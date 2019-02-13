package com.sorting;

class QuickSort {
	public static void main(String[] args) {
		int maxSize = 10; // array size
		ArrayPar arr; // reference to array
		arr = new ArrayPar(maxSize); // create the array
		
		for (int j = 0; j < maxSize; j++) // fill array with
		{ // random numbers
			long n = (int) (java.lang.Math.random() * 199);
			arr.insert(n);
		}
		arr.display(); // display items
		arr.quickSort(); // quicksort them
		arr.display();	
	}
}
