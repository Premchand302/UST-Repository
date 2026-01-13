package com;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ArrayServiceTest {
	ArrayService service = new ArrayService();
    @Test
    public void testArrayContainsValue() {
        int[] numbers = {10, 20, 30, 40};
        boolean result = service.contains(numbers, 30);
        assertTrue(result);  
    }
}
