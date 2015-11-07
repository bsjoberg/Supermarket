package com.bdd.Supermarket;

public class Checkout {
	private int total = 0;
	
	public void add(int itemCount, int bananaPrice) {
		for (int i = 0; i < itemCount; i++) {
			total = total + bananaPrice;
		}
	}

	public int total() {
		return total;
	}

}
