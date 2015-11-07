package com.bdd.Supermarket;

import org.junit.Test;

import junit.framework.TestCase;

public class CheckoutTest extends TestCase {
	private int total = 0;
	Checkout checkout = null;
	
	public CheckoutTest() {
		checkout = new Checkout();
	}
	
	@Test
	public void testAddOneItem() {
		// Add one item and check total
		checkout.add(1, 30);
		assertEquals(30, checkout.total());
	}
	
	@Test
	public void testAddTwoItemsSamePrice() {
		checkout.add(2, 30);
		assertEquals(60, checkout.total());
	}
	
	@Test
	public void testAddTwoItemsDifferentPrice() {
		checkout.add(1, 30);
		checkout.add(1, 50);
		assertEquals(80, checkout.total());
	}
}
