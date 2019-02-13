package com.programmingSearch.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SequentialParallelStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> strings = new ArrayList<>();
		/*for(int i =0;i<10000;i++){
			strings.add("Item "+i);
		}
		*/
		
		strings.add("Item 1");
		strings.add("Item 2");
		strings.add("Item 5");
		strings.add("Item 2");
		strings.add("Item 1");
		strings.add("Item 8");
		Stream<String> string = strings.stream().distinct();
		string.forEach(s -> System.out.println(s));
	}

}
