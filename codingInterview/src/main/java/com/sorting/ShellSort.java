package com.sorting;

public class ShellSort {

	public static void main(String[] args) {
		// public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int num[] = { 4, 5, 7, 2, 3, 9 };
		int num[] = { 6,8,1,4,5,3,7,2 };
		//int sortedarray[] = bubblesorting(num);
	//	int sortedarray[] = selectionSort(num);
		//int sortedarray[] = bucketSort(num);
		int sortedarray[] = shellsort(num);
		for (int i : sortedarray) {
			System.out.print(","+i);
		}

	}

	private static int[] shellsort(int[] num) {
		
		int h=1;
		while(h <= num.length/3)
			h= h*3 + 1;
		while (h>0)
		{
			for(int i=h;i<num.length;i++){
				int v=num[i];
				int j=i;
				while(j> h-1 && num[j-h]>= v){
					
					num[j]=num[j-1];
					j--;
					
				}
				num[j]=v;
			}
			h = (h-1) / 3;
			
		}
		return num;
	}
	
	public static int[] insertionSort(int[] num)
	{
		for(int i=2;i<num.length;i++){
			int v=num[i];
			int j=i;
			while(j>=1 && num[j-1]> v){
				
				num[j]=num[j-1];
				j--;
				
			}
			num[j]=v;
		}
		return num;
		
	}
	

}
