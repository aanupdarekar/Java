package com.programmingSearch.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = new ArrayList<Integer>();
		li.add(23);
		li.add(4);
		li.add(55);
		li.add(43);
		
		Predicate<Integer> pred = (p) -> p >= 25;
		//filtering using predicate
		li.forEach((i) -> {
			if(pred.test(i)){
				System.out.println(i);	
			}
		});

		//tthis is sequential stream
		li.stream().filter(pred)
		.forEach(p -> System.out.println(p));
		
		//tis is parellael stream
		li.parallelStream().filter(pred)
		.forEach(p -> System.out.println(p));
		
		//Sum all the integer
		int sum = li.stream().mapToInt(p -> p).sum();
		System.out.println(sum);
		
		//while averageing you wil get optional value
		OptionalDouble avg = li.stream().mapToInt(p -> p).average();
		if(avg.isPresent()) {
			System.out.println("Avergage "+avg);
		}else {
			System.out.println("Average not calculate");
		}
		
		Map<String, List<String>> people = new HashMap<>();
		people.put("John", Arrays.asList("555-1123", "555-3389"));
		people.put("Mary", Arrays.asList("555-2243", "555-5264"));
		people.put("Steve", Arrays.asList("555-6654", "555-3242"));
		
		List<Stream<String>> phones = people.values().stream()
				.map(Collection::stream)
		.collect(Collectors.toList());
		phones.forEach(p -> p.forEach(i-> System.out.println(i)));
	}

}
