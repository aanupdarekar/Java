package com.programmingSearch.hackerrank.hashmap;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	// Complete the freqQuery function below.
	static List<Integer> freqQuery(List<List<Integer>> queries) {

		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> counter = new HashMap<Integer, Integer>();
		List<Integer> retList = new ArrayList<Integer>();

		for (int i = 0; i < queries.size(); i++) {

			int op = queries.get(i).get(0);
			int number = queries.get(i).get(1);
			int count = hash.getOrDefault(number, 0);
			switch (op) {
			case 1:

				hash.put(number, count + 1);
				counter.put(count + 1, counter.getOrDefault(count + 1, 0) + 1);
				if (count > 0) {
					counter.put(count, counter.getOrDefault(count, 1) - 1);
				}
				break;

			case 2:
				if (count > 0) {
					hash.put(number, count - 1);
					counter.put(count, counter.getOrDefault(count, 1) - 1);
					counter.put(count - 1, counter.getOrDefault(count - 1, 0) + 1);
				}

				break;
			case 3:
				if (counter.getOrDefault(number, 0) > 0) {
					retList.add(1);
				} else
					retList.add(0);

			}
		}

		return retList;
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
	public static void main(String[] args) throws IOException {

		List<List<Integer>> queries = new ArrayList<>();

		List<Integer> queriesRowItems = new ArrayList<>();
		queriesRowItems.add(1);
		queriesRowItems.add(1);
		List<Integer> queriesRowItems1 = new ArrayList<>();
		queriesRowItems1.add(2);
		queriesRowItems1.add(2);
		List<Integer> queriesRowItems2 = new ArrayList<>();
		queriesRowItems2.add(3);
		queriesRowItems2.add(2);
		List<Integer> queriesRowItems3 = new ArrayList<>();
		queriesRowItems3.add(1);
		queriesRowItems3.add(1);
		List<Integer> queriesRowItems4 = new ArrayList<>();
		queriesRowItems4.add(1);
		queriesRowItems4.add(1);

		List<Integer> queriesRowItems5 = new ArrayList<>();
		queriesRowItems5.add(2);
		queriesRowItems5.add(1);

		List<Integer> queriesRowItems6 = new ArrayList<>();
		queriesRowItems6.add(3);
		queriesRowItems6.add(2);

		queries.add(queriesRowItems);
		queries.add(queriesRowItems1);
		queries.add(queriesRowItems2);
		queries.add(queriesRowItems3);
		queries.add(queriesRowItems4);
		queries.add(queriesRowItems5);
		queries.add(queriesRowItems6);

		List<Integer> ans = freqQuery(queries);
		System.out.println(ans);
		
		int array []= {1,3, 5, 2, 4, 6, 8};
		minimumSwaps(array);

	}
}
