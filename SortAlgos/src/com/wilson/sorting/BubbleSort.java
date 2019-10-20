package com.wilson.sorting;

public class BubbleSort {
	public static int[] sort(int[] unsorted) {
		int index = 0;
		int unsortedPartitionIndex = unsorted.length - 1;
		
		while(unsortedPartitionIndex >= 1) {
			while(index < unsortedPartitionIndex) {
				if (unsorted[index] > unsorted[index + 1]) {
					int placeholder = unsorted[index];
					unsorted[index] = unsorted[index + 1];
					unsorted[index + 1] = placeholder;
				}
				index++;
			}
			index = 0;
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
