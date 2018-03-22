package com.sorting;

public class PartitionAlgorithm {

	public static int[] arr = new int[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pivotValue = 50;

		populateA(arr);
		display(arr);
		paritionit(0, arr.length - 1, pivotValue);
		display(arr);
	}

	private static void display(int[] arr2) {
		// TODO Auto-generated method stub

		for (int i : arr2) {
			System.out.print("," + i);

		}
		System.out.println();
	}

	private static void paritionit(int left, int right, int pivotValue) {

		// TODO Auto-generated method stub
		int leftptr = left - 1;
		int rightptr = right + 1;
		while (true) {
			while (leftptr < right && arr[++leftptr] < pivotValue)
				;

			while (rightptr > left && arr[--rightptr] > pivotValue)
				;

			if (leftptr >= rightptr)
				break;
			else {
				swap(leftptr, rightptr);
			}
		}
	}

	private static void swap(int leftptr, int rightptr) {
		// TODO Auto-generated method stub
		int temp = arr[leftptr];
		arr[leftptr]=arr[rightptr];
		arr[rightptr] =temp;
	}

	public static int[] populateA(int[] s) {
		for (int i = 0; i < s.length; i++) {
			s[i] = (int) (Math.random() * 100);
		}
		return s;
	}

}
