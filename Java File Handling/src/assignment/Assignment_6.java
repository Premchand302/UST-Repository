package assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment_6 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new FileReader("students.csv"));
        String line;
        br.readLine();
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            int marks = Integer.parseInt(data[2]);
            if (marks < 40) {
                System.out.println("ID: " + data[0] +", Name: " + data[1] +", Marks: " + marks);
            }
        }

        br.close();
    }
}
