package com.programmingSearch.lynda.java;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] data = new String[][]{{"a", "b`"}, {"b", "d"}, {"e", "f"}};

        //Stream<String[]>
        Stream<String[]> temp = Arrays.stream(data);
        
        temp.flatMap(x -> Arrays.stream(x)).distinct().forEach(System.out::println);
	}

}
