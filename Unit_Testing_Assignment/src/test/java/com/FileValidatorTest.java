package com;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FileValidatorTest {

    FileValidator validator = new FileValidator();

    @Test
    public void testCsvFile() {
        boolean result = validator.isCsvFile("data.csv");
        assertTrue(result);  
    }
}
