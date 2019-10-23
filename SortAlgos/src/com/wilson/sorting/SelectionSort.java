package com.wilson.sorting;

public class SelectionSort {
	public static int[] sort(int[] unsorted, String direction) {
		int[] sorted = new int[unsorted.length];
		if (direction.toLowerCase() == "ascending") {
			sorted = sortAscending(unsorted);
		} else {
			// return sortDescending(unsorted);
		}
		return sorted;
	}
	
	public static int[] sortAscending(int[] unsorted) {
		int lastUnsortedIndex = unsorted.length - 1;
		int i = 0;
		int largest = 0;
		
		while(lastUnsortedIndex > 1) {
			while(i < lastUnsortedIndex) {
				if(unsorted[i] > unsorted[largest]) {
					largest = i;
				}
				i++;
			}
			swap(unsorted, largest, lastUnsortedIndex);
			i = 0;
			largest = 0;
			lastUnsortedIndex--;
		}
		return unsorted;
	}
	
	public static void swap(int[] array, int i, int j) {
		if (i == j) {
			return;
		}
		int placeholder = array[i];
		array[i] = array[j];
		array[j] = placeholder;
	}
}
