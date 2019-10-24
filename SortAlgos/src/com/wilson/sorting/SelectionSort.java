package com.wilson.sorting;

public class SelectionSort {
	public static int[] sort(int[] unsorted, String direction) {
		int[] sorted = new int[unsorted.length];
		if (direction.toLowerCase() == "ascending") {
			sorted = sortAscending(unsorted);
		} else {
			sorted = sortDescending(unsorted);
		}
		return sorted;
	}
	
	public static int[] sortAscending(int[] unsorted) {
		int lastUnsortedIndex = unsorted.length - 1;
		int i = 1;
		int largest = 0;
		
		while(lastUnsortedIndex > 1) {
			while(i <= lastUnsortedIndex) {
				if(unsorted[i] > unsorted[largest]) {
					largest = i;
				}
				i++;
			}
			swap(unsorted, largest, lastUnsortedIndex);
			i = 1;
			largest = 0;
			lastUnsortedIndex--;
		}
		return unsorted;
	}
	
	public static int[] sortDescending(int[] unsorted) {
		int lastUnsortedIndex = 0;
		int i = unsorted.length - 2;
		int largest = unsorted.length - 1;
		
		while(lastUnsortedIndex < unsorted.length - 2) {
			while(i >= lastUnsortedIndex) {
				if(unsorted[i] > unsorted[largest]) {
					largest = i;
				}
				i--;
			}
			swap(unsorted, largest, lastUnsortedIndex);
			i = unsorted.length - 2;
			largest = unsorted.length - 1;
			lastUnsortedIndex++;
		}
		return unsorted;
	}
	
	public static void swap(int[] unsorted, int largest, int lastUnsortedIndex) {
		if (unsorted[largest] == unsorted[lastUnsortedIndex]) {
			return;
		}
		int placeholder = unsorted[lastUnsortedIndex];
		unsorted[lastUnsortedIndex] = unsorted[largest];
		unsorted[largest] = placeholder;
	}
}
