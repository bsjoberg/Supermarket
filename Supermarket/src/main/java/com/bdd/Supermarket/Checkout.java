package com.bdd.Supermarket;

public class Checkout {
	private int runningTotal = 0;
	
	public void add(int itemCount, int price) {
		runningTotal += (itemCount * price);
	}

	public int total() {
		return runningTotal;
	}

}
