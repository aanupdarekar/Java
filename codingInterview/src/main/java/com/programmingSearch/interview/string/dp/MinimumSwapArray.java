package com.programmingSearch.interview.string.dp;

public class MinimumSwapArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int q[] = { 1, 3, 7, 8, 6, 4 };
		System.out.println(minimumSwaps(q));

	}
	// Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
    int swap=0;
        for(int i =0 ;i<arr.length;){
        if(arr[i] == (i+1) || arr[i] >= arr.length){
            i++;
            continue;
            
         }
        int temp = arr[i];
        arr[i] =  arr[temp -1];
        arr[temp -1]= temp;
        swap ++;
        }
        return swap;

    }

}
