package com;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GreetingServiceTest {

    @Test
    public void testGreetingMessage() {
        GreetingService service = new GreetingService();
        String result = service.getGreeting("Raj");
        assertEquals("Welcome, Raj", result); 
    }
}
