package com.sorting;

public class Medianof3Sort {
	public static long[] theArray = new long[10];
	public int nElems = theArray.length;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medianof3Sort m3 = new Medianof3Sort();
		populateA(theArray);
		display(theArray);
	
		m3.quickSort(); // quicksort them
		display(theArray);
	}

	private static void display(long[] arr2) {
		// TODO Auto-generated method stub

		for (long i : arr2) {
			System.out.print("," + i);

		}
		System.out.println();
	}

	public void quickSort() {
		recQuickSort(0, nElems - 1);
	}

	// --------------------------------------------------------------
	public void recQuickSort(int left, int right) {
		int size = right - left + 1;
		if (size <= 3) // manual sort if small
			manualSort(left, right);
		else // quicksort if large
		{
			long median = medianOf3(left, right);
			int partition = partitionIt(left, right, median);
			recQuickSort(left, partition - 1);
			recQuickSort(partition + 1, right);
		}
	} // end recQuickSort
		// --------------------------------------------------------------

	public long medianOf3(int left, int right) {
		
		int center = (left + right) / 2;
		
		// order left & center
		if (theArray[left] > theArray[center])
			swap(left, center);
		
		// order left & right
		if (theArray[left] > theArray[right])
			swap(left, right);
		
		// order center & right
		if (theArray[center] > theArray[right])
			swap(center, right);
		
		swap(center, right - 1); // put pivot on right
		
		return theArray[right - 1]; // return median value
	} // end medianOf3()
		// --------------------------------------------------------------

	public void swap(int dex1, int dex2) // swap two elements
	{
		long temp = theArray[dex1]; // A into temp
		
		theArray[dex1] = theArray[dex2]; // B into A
		
		theArray[dex2] = temp; // temp into B
		
	} // end swap(
		// --------------------------------------------------------------

	public int partitionIt(int left, int right, long pivot) {
		
		int leftPtr = left; // right of first elem
		int rightPtr = right - 1; // left of pivot
		
		while (true) {
			
			while (theArray[++leftPtr] < pivot) // find bigger
				; // (nop)
			
			while (theArray[--rightPtr] > pivot) // find smaller
				; // (nop)
			
			if (leftPtr >= rightPtr) // if pointers cross,
				break; // partition done
			else // not crossed, so
				swap(leftPtr, rightPtr); // swap elements
		} // end while(true)
		
		swap(leftPtr, right - 1); // restore pivot
		
		return leftPtr; // return pivot location
	} // end partitionIt()

	public static long[] populateA(long[] s) {
		for (int i = 0; i < s.length; i++) {
			s[i] = (int) (Math.random() * 100);
		}
		return s;
	}

	// --------------------------------------------------------------
	public void manualSort(int left, int right) {
		
		int size = right - left + 1;
		if (size <= 1)
			return; // no sort necessary
		if (size == 2) { // 2-sort left and right
			if (theArray[left] > theArray[right])
				swap(left, right);
			return;
		}
		else // size is 3
		{ // 3-sort left, center, & right
			if (theArray[left] > theArray[right - 1])
				swap(left, right - 1); // left, center
			
			if (theArray[left] > theArray[right])
				swap(left, right); // left, right
			
			if (theArray[right - 1] > theArray[right])
				swap(right - 1, right); // center, right
		}
	} // end manualSort()
}
