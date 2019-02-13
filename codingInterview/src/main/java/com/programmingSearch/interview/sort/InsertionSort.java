package com.programmingSearch.interview.sort;

public class InsertionSort {

	public static void main(String[] args) {
		// ODO Auto-generated method stub
		
		int num[] = { 6,8,1,4,5,3,7,2 };
		num = insertionSort(num);
		for (int i : num) {
			System.out.println(i);
		}

	}

	private static int[] insertionSort(int[] num) {
		int current = 0;
		for(int i=0;i<num.length;i++){
			current =num[i];
			int j=i-1;
			while(j>=0 && num[j]>current)
			{	num[j+1] = num[j];
				j=j-1;
				    
			}
			num[j+1] =current;
			
		}
		// TODO Auto-generated method stub
		return num;
	}

}
