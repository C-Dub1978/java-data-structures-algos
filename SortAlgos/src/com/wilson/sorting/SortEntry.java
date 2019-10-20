package com.wilson.sorting;

public class SortEntry {

	public static void main(String[] args) {
		
		// BUBBLE SORT
		int[] unsorted1 = new int[] {55, 2, 29, -1, 0, 11, 27, -13, 18};
		int[] unsorted2 = new int[] {123, -22, -76, 49, 0, 33, 47, 1, 14, -3, 90, 18};
		int[] sorted1 = BubbleSort.sort(unsorted1);
		int[] sorted2 = BubbleSort.sort(unsorted2);
		System.out.println("Sorted 1: " + BubbleSort.toString(sorted1));
		System.out.println("Sorted 2: " + BubbleSort.toString(sorted2));
		//
	}

}
