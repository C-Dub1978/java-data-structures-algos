package com.wilson.sorting;

public class SortEntry {

	public static void main(String[] args) {
		
		System.out.println("Bubble Sorts: ==================");
		System.out.println("");
		// BUBBLE SORT
		int[] unsorted1 = new int[] {55, 2, 29, -1, 0, 11, 27, -13, 18};
		int[] unsorted2 = new int[] {123, -22, -76, 49, 0, 33, 47, 1, 14, -3, 90, 49, 18};
		int[] unsorted3 = new int[] {33, -180, -3, 73, 11, 39, 0, -1, 85, 38};
		int[] unsorted4 = new int[] {3, 23, 398, 88, -11, -92, 0, 33, 82, -3, 8, 83};
		int[] sorted1 = BubbleSort.sort(unsorted1, "ascending");
		int[] sorted2 = BubbleSort.sort(unsorted2, "ascending");
		int[] sorted3 = BubbleSort.sort(unsorted3, "descending");
		int[] sorted4 = BubbleSort.sort(unsorted4, "descending");
		System.out.println("Sorted 1: " + SortEntry.toString(sorted1));
		System.out.println("Sorted 2: " + SortEntry.toString(sorted2));
		System.out.println("");
		System.out.println("Sorted 3: " + SortEntry.toString(sorted3));
		System.out.println("Sorted 4: " + SortEntry.toString(sorted4));
		
		System.out.println("");
		System.out.println("Selection Sorts ================");
		System.out.println("");
		// SELECTION SORT
		int[] unsorted5 = new int[] {55, 2, 29, -1, 0, 11, 27, -13, 18};
		int[] unsorted6 = new int[] {123, -22, -76, 49, 0, 33, 47, 1, 14, -3, 90, 49, 18};
		int[] unsorted7 = new int[] {33, -180, -3, 73, 11, 39, 0, -1, 85, 38};
		int[] unsorted8 = new int[] {3, 23, 398, 88, -11, -92, 0, 33, 82, -3, 8, 83};
		int[] selectionSort1 = SelectionSort.sort(unsorted5, "ascending");
		int[] selectionSort2 = SelectionSort.sort(unsorted6, "ascending");
		int[] selectionSort3 = SelectionSort.sort(unsorted7, "descending");
		int[] selectionSort4 = SelectionSort.sort(unsorted8, "descending");
		System.out.println("Sorted 1: " + SortEntry.toString(selectionSort1));
		System.out.println("Sorted 2: " + SortEntry.toString(selectionSort2));
		System.out.println("");
		System.out.println("Sorted 3: " + SortEntry.toString(selectionSort3));
		System.out.println("Sorted 4: " + SortEntry.toString(selectionSort4));
		System.out.println("");
	}
	
	public static void swap(int[] unsorted, int i, int j) {
		if (unsorted[i] == unsorted[j]) {
			return;
		}
		int placeholder = unsorted[j];
		unsorted[j] = unsorted[i];
		unsorted[i] = placeholder;
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
