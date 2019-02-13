package com.programmingSearch.dataStructure.graph.dijkstra;

public class MiniumSwap {

	public static void main(String[] args) {

		int i[] = { 3, 1, 2 };
		int minswap = minimumSwaps(i);
		System.out.println(minswap);

		// TODO Auto-generated method stub

	}

	static int minimumSwaps(int[] arr) {
		int swap = 0;
		for (int i = 0; i < arr.length;) {
			if (arr[i] == (i + 1) || arr[i] >= arr.length) {
				i++;
				continue;

			}
			int temp = arr[i];
			arr[i] = arr[temp - 1];
			arr[temp - 1] = temp;
			swap++;
		}
		return swap;

	}
}
