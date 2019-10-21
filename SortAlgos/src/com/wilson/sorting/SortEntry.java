package com.wilson.sorting;

public class SortEntry {

	public static void main(String[] args) {
		
		// BUBBLE SORT
		int[] unsorted1 = new int[] {55, 2, 29, -1, 0, 11, 27, -13, 18};
		int[] unsorted2 = new int[] {123, -22, -76, 49, 0, 33, 47, 1, 14, -3, 90, 49, 18};
		int[] unsorted3 = new int[] {33, -180, -3, 73, 11, 39, 0, -1, 85, 38};
		int[] unsorted4 = new int[] {3, 23, 398, 88, -11, -92, 0, 33, 82, -3, 8, 83};
		int[] sorted1 = BubbleSort.sort(unsorted1, "ascending");
		int[] sorted2 = BubbleSort.sort(unsorted2, "ascending");
		int[] sorted3 = BubbleSort.sort(unsorted3, "descending");
		int[] sorted4 = BubbleSort.sort(unsorted4, "descending");
		System.out.println("Sorted 1: " + BubbleSort.toString(sorted1));
		System.out.println("Sorted 2: " + BubbleSort.toString(sorted2));
		System.out.println("");
		System.out.println("Sorted 3: " + BubbleSort.toString(sorted3));
		System.out.println("Sorted 4: " + BubbleSort.toString(sorted4));
		
		// SELECTION SORT
		
	}

}
