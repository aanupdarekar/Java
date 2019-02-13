package com.programmingSearch.interview.sort;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArraySwap {

	// Complete the minimumBribes function below.
	static void minimumBribes(int[] queue) {
		boolean chaotic = false;
		int count = 0, sumcount = 0;

		if (queue.length > 1) {
			for (int i = 1; i < queue.length; i++) {
				if (queue[i - 1] - i > 2) {
					System.out.println("Too chaotic");
					chaotic = true;
					break;
				}
			}

			if (!chaotic) {
				for (int i =0; i < queue.length; i++) {
					int current = queue[i];
					int j = i-1;
					while (j >=0 && queue[j] >= current) {
						queue[j+1] = queue[j];
						j--;
						count++;
					}
					queue[j+1] = current;
				}
				System.out.println(count);
			}

		}
	}

	public static void main(String[] args) {

		int q[] = { 1, 2, 5, 3, 7, 8, 6, 4 };
		minimumBribes(q);
		;
	}

}
