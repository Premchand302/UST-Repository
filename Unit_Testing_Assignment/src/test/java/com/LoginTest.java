package com;

import static org.junit.Assert.*;
import org.junit.Test;

public class LoginTest {
	Login service = new Login();
	@Test
	public void validLoginTest() {
		boolean result = service.login("admin","admin123");
		assertTrue(result);
	}
	@Test
	public void invalidLoginTest() {
		boolean result = service.login("admin","password");
		assertFalse(result);
	}
}
