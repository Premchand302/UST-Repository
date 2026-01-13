package assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment_4 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new FileReader("students.csv"));
        String line;
        br.readLine();
        int count = 0;
        while ((line = br.readLine()) != null) {
            count++;
        }
        System.out.println("Number of lines: " +count);
        br.close();
    }
}
