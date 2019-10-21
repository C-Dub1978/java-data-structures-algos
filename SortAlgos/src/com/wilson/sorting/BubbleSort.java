package com.wilson.sorting;

public class BubbleSort {
	public static int[] sort(int[] unsorted, String direction) {
		int index = direction.toLowerCase() == "ascending" ? 0 : unsorted.length - 1;
		int unsortedPartitionIndex = direction.toLowerCase() == "ascending" ? unsorted.length - 1 : 0;
				
		return direction.toLowerCase() == "ascending" ? sortAscending(unsorted, index, unsortedPartitionIndex) : sortDescending(unsorted, index, unsortedPartitionIndex);
		
	};
	
	private static int[] sortAscending(int[] unsorted, int index, int unsortedPartitionIndex) {
		while(unsortedPartitionIndex >= 1) {
			while(index < unsortedPartitionIndex) {
				if (unsorted[index] > unsorted[index + 1]) {
					swap(unsorted, index, index + 1);
				}
				index++;
			}
			index = 0;
			unsortedPartitionIndex--;
		}
		return unsorted;
	}
	
	private static int[] sortDescending(int[] unsorted, int index, int unsortedPartitionIndex) {
		while(unsortedPartitionIndex <= unsorted.length - 1) {
			while(index > unsortedPartitionIndex) {
				if (unsorted[index] > unsorted[index - 1]) {
					swap(unsorted, index, index - 1);
				}
				index--;
			}
			index = unsorted.length - 1;
			unsortedPartitionIndex++;
		}
		return unsorted;
	}
	
	private static void swap(int[] array, int i, int j) {
		if (i == j) {
			return;
		}
		int placeholder = array[i];
		array[i] = array[j];
		array[j] = placeholder;
	}
	
	public static String toString(int[] sortedArr) {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < sortedArr.length - 1; i++) {
			sb.append(" " + sortedArr[i] + ",");
		}
		sb.append(" " + sortedArr[sortedArr.length - 1] + " ]");
		return sb.toString();
	}
}
