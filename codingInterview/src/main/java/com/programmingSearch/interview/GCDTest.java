package com.programmingSearch.interview;

public class GCDTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gcd(25, 25);
		System.out.println(gcdFind(25, 10));
	}

	private static void gcd(int i, int j) {
		// TODO Auto-generated method stub
		if (i % j == 0) {
			System.out.println(j);
		} else {
			gcd(j, i % j);
		}

	}

	private static int gcdFind(int i, int j) {
		// TODO Auto-generated method stub
		if (j == 0) {
			return i;
		}
		return gcdFind(j, i % j);

	}

}
