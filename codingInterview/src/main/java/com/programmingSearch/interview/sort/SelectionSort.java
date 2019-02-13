package com.programmingSearch.interview.sort;

public class SelectionSort {

	public static void main(String[] args) {
		// ODO Auto-generated method stub
		
		int num[] = { 6,8,1,4,5,3,7,2 };
		num = selectionSort(num);
		for (int i : num) {
			System.out.println(i);
		}

	}

	private static int[] selectionSort(int[] num) {
		int minIndex = 0;
		for(int i=0;i<num.length;i++){
			minIndex =i;
			for(int j=i+1;j<num.length;j++){
				if(num[j] < num[minIndex]){
					minIndex= j;
				}
			}
			int tmp = num[minIndex];
			num[minIndex]= num[i];
			num[i] =tmp;
			
		}
		// TODO Auto-generated method stub
		return num;
	}
	

}
