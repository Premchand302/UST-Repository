package com;
public class FileValidator {

    public boolean isCsvFile(String fileName) {
        return fileName.endsWith(".csv");
    }
}
