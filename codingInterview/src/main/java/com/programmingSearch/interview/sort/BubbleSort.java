package com.programmingSearch.interview.sort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = { 6,8,1,4,5,3,7,2 };
		int array[] = new int[10];
		for(int i=0;i<array.length;i++){
			array[i]= (int)Math.random();
		}
		
		num = bubbleSort(num);
		for (int i : num) {
			System.out.println(i);
		}
	}

	private static int[] bubbleSort(int[] num) {
		
		for(int i=0;i<num.length;i++){
			for(int j=0;j<num.length-1;j++){
				if(num[j] >num[j+1]){
					int temp = num[j];
					num[j]= num[j+1];
					num[j+1] = temp;
				} 
			}
		}
		return num;
	}

}
