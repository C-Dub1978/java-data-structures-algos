package com.wilson;

public class MainArray {

	public static void main(String[] args) {
		int[] myInts = new int	[7];
		myInts[0] = 20;
		myInts[1] = 33;
		myInts[2] = 84;
		myInts[3] = 888;
		myInts[4] = 3;
		myInts[5] = 77;
		myInts[6] = -22;
		for (int i = 0; i < myInts.length; i++) {
			System.out.println(myInts[i]);
		}
	}

}

class MyObject {
	String title = "Some Object With id: " + this.id;
	int id;
	
	public MyObject(int id) {
		this.id = id;
	}
}
