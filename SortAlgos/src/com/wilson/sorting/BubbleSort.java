package com.wilson.sorting;

public class BubbleSort {
	public static int[] sort(int[] unsorted) {
		int index = 0;
		int unsortedPartitionIndex = unsorted.length - 1;
		
		// While the unsortedPartitionIndex is greater than 1 (second index)
		while(unsortedPartitionIndex >= 1) {
			// Traverse left to right until the index is still less than unsortedPI
			while(index < unsortedPartitionIndex) {
				// Swap indices if applicable
				if (unsorted[index] > unsorted[index + 1]) {
					int placeholder = unsorted[index];
					unsorted[index] = unsorted[index + 1];
					unsorted[index + 1] = placeholder;
				}
				// keep increasing index until its just under unsortedPI
				index++;
			}
			// Reset index to 0, to get ready for next traversal
			index = 0;
			// Decrease unsortedPI, and keep doing so while greater than 1
			unsortedPartitionIndex--;
		}
		return unsorted;
	};
	
	public static String toString(int[] sortedArr) {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < sortedArr.length - 1; i++) {
			sb.append(" " + sortedArr[i] + ",");
		}
		sb.append(" " + sortedArr[sortedArr.length - 1] + " ]");
		return sb.toString();
	}
}
