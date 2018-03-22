package com.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int num[] = { 4, 5, 7, 2, 3, 9 };
		int num[] = { 6,8,1,4,5,3,7,2 };
		//int sortedarray[] = bubblesorting(num);
	//	int sortedarray[] = selectionSort(num);
		//int sortedarray[] = bucketSort(num);
		int sortedarray[] = insertionSort(num);
		for (int i : sortedarray) {
			System.out.print(","+i);
		}
	}

	// ascending sort
	public static int[] bubblesorting(int[] num) {

		int temp;
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = 0; j < num.length - 1; j++) {
				if (num[j] > num[j + 1]) {
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		return num;
	}

	//selection Sort
	public static int[] selectionSort(int[] num) {
		int min, temp;
		for (int i = 0; i < num.length - 1; i++) {
			min = i;
			for (int j = i+1; j < num.length - 1; j++) {

				if (num[min] >num[j]) {
					min =j;
				}
			}
			
			temp = num[min];
			num[min]= num[i];
			num[i]=temp;
		}
		return num;
	}
	
	
	public static int[] insertionSort(int[] num)
	{
		for(int i=2;i<=num.length-1;i++){
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
	
	
	public static int[] bucketSort(int[] num){
		int BUCKETS=10;
		int i,j,k;
		int buckets[] = new int[BUCKETS] ;
		
		//assign 0 to all the array
		for (j=0;j<BUCKETS;j++){
			buckets[j]=0;
		}
		
		//increase the value of index where you find the value i.e. index=num
		for (i=0;i<num.length;i++){
			System.out.println("****");
		
			System.out.println(++buckets[num[i]]);
		}
		
		//Print all the buckets containting 1
		for (int l : buckets) {
			System.out.print(l);
		}
		System.out.println();
		for(i=0,j=0;j<BUCKETS;j++){
			/*for(k=buckets[j];k>0;--k){
				num[i++]=j;
			}*/
			k=0;
			k=buckets[j];
			if(k>0){
				num[i++]=j;
			}
		}
		
		return num;
	}
}
