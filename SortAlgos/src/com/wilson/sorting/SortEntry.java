package com.wilson.sorting;

public class SortEntry {

	public static void main(String[] args) {
		
		// BUBBLE SORT
		int[] unsorted1 = new int[] {55, 2, 29, -1, 0, 11, 27, -13, 18};
		int[] sorted = BubbleSort.sort(unsorted1);
		System.out.println("Sorted: " + BubbleSort.toString(sorted));
		
		//
	}

}
