package com.programmingSearch.lambda;

import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinerClass {

	public static void main(String[] args) {
		
		//First argument is separator , second argument is prefix and third argument is postfix
		StringJoiner sj = new StringJoiner(",","{","}");
		sj.add("Hi").add("How");
		sj.setEmptyValue("No stooges yet");
		
		List<String> li = new LinkedList<>();
		li.add("abc");
		li.add("Def");
		li.forEach(l -> sj.add(l));
		
		System.out.println(sj);
		
		//another way
		String stooges = String.join(" and ","Larry","Curly","Moe");
		System.out.println(stooges);
	}
}
