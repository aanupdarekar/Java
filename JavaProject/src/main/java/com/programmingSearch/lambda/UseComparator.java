 package com.programmingSearch.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class UseComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Comparator<Integer> comp = (v1,v2) -> {
			//ascending sort
			return v2.compareTo(v1);
		};
		
		comp.compare(5, 8);
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(23);
		li.add(4);
		li.add(55);
		li.add(43);
		
		Collections.sort(li,comp);
		System.out.println("Printing List");
		System.out.println(li);
		
		//traversing using foreach
		li.forEach((i) -> System.out.println(i));
		
		/*Predicate<Integer> pred = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t > 25;
			}
		};*/
		
		Predicate<Integer> pred = (t)-> {
			return t > 25;
			};
		
		System.out.println("\nGreater than 25 ");
		li.forEach((i) -> {
			if(pred.test(i)) {
				
				System.out.println(i);
			}
		});
		
		//static Method Reference
		
		System.out.println("\n\nStatic method reference");
		
		//Static method reference this::compare
		Collections.sort(li,UseComparator :: compareNumber);
		li.forEach((i) -> System.out.println(i));
		
		
		//Instance method reference
		System.out.println("\n\nInstance method reference");
		UseComparator useComparator = new UseComparator();
		useComparator.sortNumber();
	}
	
	public static int compareNumber(Integer i1,Integer i2) {
		return i1.compareTo(i2);
	}

	
	public int compareNumberInstance(Integer i1,Integer i2) {
		return i2.compareTo(i1);
	}
	
	public void sortNumber(){
		List<Integer> li = new ArrayList<Integer>();
		li.add(23);
		li.add(4);
		li.add(55);
		li.add(43);
		
		Collections.sort(li, this::compareNumberInstance);
		System.out.println(li);
	}
}
