package com.programmingSearch.lynda.java;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class LazyTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final Random random = new Random();
		Supplier<Integer> s1 = () ->{
			Integer result = random.nextInt();
			System.out.println("(Supplying "+result+")");
			return result;
		};
		
		System.out.println("\n Test1");
		Stream<Integer> randoms = Stream.generate(s1);
		System.out.println("First Stream Built");
		randoms.filter(n -> n>=0).limit(3).forEach(System.out::println);
		
		//Now lets limit the stream and then generate it
		System.out.println("\n\n Test2");
		Stream<Integer> s2 = Stream.generate(s1);
		s2.limit(3).filter(n -> n>=0).forEach(System.out::println);
	}

}
