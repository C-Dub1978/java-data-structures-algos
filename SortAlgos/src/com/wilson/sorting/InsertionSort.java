package com.wilson.sorting;

public class InsertionSort {
	public static int[] sort(int[] unsorted) {
		int firstUnsortedIndex = 1;
		int i = 0;
		int newElement = unsorted[firstUnsortedIndex];
		
		while(firstUnsortedIndex < unsorted.length) {
			while(newElement <= unsorted[i] && i > 0) {
				i--;
			}
			SortEntry.shiftArray(unsorted, i, firstUnsortedIndex, newElement);
			firstUnsortedIndex++;
			i = firstUnsortedIndex - 1;
		}
		return unsorted;
	}
}
