package com;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DataServiceTest {

    @Test
    public void testDataPresent() {
        DataService service = new DataService();
        boolean result = service.isDataPresent();
        assertTrue(result);  
    }
}
