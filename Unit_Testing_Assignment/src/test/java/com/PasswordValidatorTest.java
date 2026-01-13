package com;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    public void testValidPassword() {
        boolean result = validator.isValid("password1");
        assertTrue(result);
    }

    @Test
    public void testInvalidPassword() {
        boolean result = validator.isValid("pass");
        assertFalse(result);
    }
}
