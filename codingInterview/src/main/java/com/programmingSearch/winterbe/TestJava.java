package com.programmingSearch.winterbe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> a = new HashSet<Integer>();
		a.add(1);
		a.add(2);
		a.add(9);
		a.add(1);

		a.add(2);
		a.add(3);
		a.add(1);
		a.add(4);
		a.add(1);
		a.add(5);
		a.add(7);
		List<Integer> mainList = new ArrayList<Integer>();
		mainList.addAll(a);
		Collections.sort(mainList);
		System.out.println(mainList);
		mysticAlgorithm(2437,875);

	}
	
	static void mysticAlgorithm(int x ,int y){
		
		while(x!=y){
			System.out.println("x= "+x+" ... y="+y);
			if(x> y){
				x = x-y;
			}else if(y>x){
				y=y-x;
			}
			
			
		}
		if(x==y){
			System.out.println(x);System.out.println(y);
		}
		
	}

}
