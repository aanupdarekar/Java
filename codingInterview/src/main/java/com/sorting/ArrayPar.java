package com.sorting;

class ArrayPar {
	private long[] theArray; // ref to array theArray
	private int nElems; // number of data items
	// --------------------------------------------------------------

	public ArrayPar(int max) // constructor
	{
		theArray = new long[max]; // create the array
		nElems = 0; // no items yet
	}

	// --------------------------------------------------------------
	public void insert(long value) // put element into array
	{
		theArray[nElems] = value; // insert it
		nElems++; // increment size
	}

	// --------------------------------------------------------------
	public int size() // return number of items
	{
		return nElems;
	}

	// --------------------------------------------------------------
	public void display() // displays array contents
	{
		System.out.print("");
		for (int j = 0; j < nElems; j++) // for each element,
			System.out.print(theArray[j] + " "); // display it
		System.out.println("");
	}

	// --------------------------------------------------------------
	public int partitionIt(int left, int right, long pivot) {
		int leftPtr = left - 1; // right of first elem
		int rightPtr = right; // since pivot is already right
		while (true) {
			// find bigger item
			while (theArray[++leftPtr] < pivot)
				;

			// find smaller item
			while (rightPtr > 0 && theArray[--rightPtr] > pivot)
				;

			if (leftPtr >= rightPtr) // if pointers cross,
				break; // partition done
			else // not crossed, so
				swap(leftPtr, rightPtr); // swap elements
		} // end while(true)
		
		swap(leftPtr, right); //restore pivot
		return leftPtr; // return pivot location
	} // end partitionIt()
		// --------------------------------------------------------------

	public void swap(int dex1, int dex2) // swap two elements
	{
		long temp;
		temp = theArray[dex1]; // A into temp
		theArray[dex1] = theArray[dex2]; // B into A
		theArray[dex2] = temp; // temp into B
	}

	public void recQuickSort(int left, int right) {
		if (right - left <= 0) // if size <= 1,
			return; // already sorted
		else // size is 2 or larger
		{
			long pivot = theArray[right]; // rightmost item
			// partition range
			int partition = partitionIt(left, right, pivot);
			recQuickSort(left, partition - 1); // sort left side
			recQuickSort(partition + 1, right); // sort right side
		}
	}
	
	
	public void quickSort()
	{
		recQuickSort(0, nElems-1);
		}
}