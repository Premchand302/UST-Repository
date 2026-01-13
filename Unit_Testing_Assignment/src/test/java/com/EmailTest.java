package com;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmailTest {
	Email e = new Email();
	@Test
	public void testEmailContains() {
		boolean result = e.emailContains("admin@gmail.com");
		assertTrue(result);
	}

}
