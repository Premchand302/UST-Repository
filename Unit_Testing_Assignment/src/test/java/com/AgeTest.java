package com;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgeTest {
	Age a = new Age();
	@Test
	public void validAgeTest() {
		boolean result = a.checkAge(19);
		assertTrue(result);
	}
	@Test
	public void invalidAgeTest() {
		boolean result = a.checkAge(15);
		assertFalse(result);
	}
}
