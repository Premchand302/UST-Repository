package assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment_9 {
	public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("students.csv"))) {
            String line;
            System.out.println(br.readLine());
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                try {
                    int marks = Integer.parseInt(data[2].trim());
                    System.out.println( "ID: " + data[0] +", Name: " + data[1] + ", Marks: " + marks  );

                } catch (NumberFormatException e) {
                    System.out.println("Invalid row skipped: " + line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file.");
        }
	}
}
