package com.datastructure.test;

public class BigONotation {
	private static int[] theArray;
	private int arraySize;
	private int itemsInArray = 0;
	static long startTime;

	static long endTime;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigONotation testAlgo2 = new BigONotation(165);
		testAlgo2.generateRandomArray();
		for (String string : args) {

		}
		startTime = System.currentTimeMillis();

		testAlgo2.quickSort(0, testAlgo2.itemsInArray);

		for (int string : theArray) {
			System.out.print("," + string);
		}
		endTime = System.currentTimeMillis();
		System.out.println();
		System.out.println("Quick Sort Took " + (endTime - startTime));

	}

	public void quickSort(int left, int right) {

		if (right - left <= 0)
			return;

		else {

			int pivot = theArray[right];

			int pivotLocation = partitionArray(left, right, pivot);

			quickSort(left, pivotLocation - 1);
			quickSort(pivotLocation + 1, right);

		}

	}

	public int partitionArray(int left, int right, int pivot) {

		int leftPointer = left - 1;
		int rightPointer = right;

		while (true) {

			while (theArray[++leftPointer] < pivot)
				;

			while (rightPointer > 0 && theArray[--rightPointer] > pivot)
				;

			if (leftPointer >= rightPointer) {

				break;

			} else {

				swapValues(leftPointer, rightPointer);

			}

		}

		swapValues(leftPointer, right);

		return leftPointer;

	}

	BigONotation(int size) {

		arraySize = size;

		theArray = new int[size];

	}

	public void generateRandomArray() {

		for (int i = 0; i < arraySize; i++) {

			theArray[i] = (int) (Math.random() * 1000) + 10;

		}

		for (int i : theArray) {
			System.out.print("," + i);
		}
		System.out.println();
	}

	public void swapValues(int indexOne, int indexTwo) {

		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;

	}

}
