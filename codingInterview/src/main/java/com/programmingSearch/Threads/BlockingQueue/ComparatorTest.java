package com.programmingSearch.Threads.BlockingQueue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s = {"a", "x", "y"};
		//Integer i2=new Integer(12);
		Integer i[] =  {12,1,22,3,44};
	//	int[] i = {12,1,22,3,44};
		Arrays.sort(i, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if(o1<o2){
					return -1;
				}else if(o1 >o2){
					return 1;
				}else{
					return 0;
				}
			}

		  
		});
		for (Integer integer : i) {
			System.out.println(integer);
		}
		Predicate<Integer> pred = (p)-> p >=35;

	}

}
