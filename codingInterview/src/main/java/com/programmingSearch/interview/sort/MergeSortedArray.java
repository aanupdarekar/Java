package com.programmingSearch.interview.sort;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= {1,4,5};
		int [] b = {2,3};
		
		int mergedarray[] = merge(a,b);
		for (int i : mergedarray) {
			System.out.println(i);
		}
	}

	private static int[] merge(int[] a, int[] b) {
		// TODO Auto-generated method stub
		int length = a.length+b.length;
		int mergedarray[] =new int[length];
		
		int i=0,j=0;
		
		for(int k=0;k<length;k++){
			if((j>=b.length)||(i< a.length &&(a[i] <= b[j]))){
				mergedarray[k] = a[i];
				i=i+1;
			}else{
				mergedarray[k] = b[j];
				j=j+1;
			}
		}
		return mergedarray;
	}

}
