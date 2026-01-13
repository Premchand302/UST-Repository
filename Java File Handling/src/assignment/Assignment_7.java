package assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment_7 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new FileReader("students.csv"));
        String line;
        br.readLine();
        int sum = 0;
        int count = 0;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            int marks = Integer.parseInt(data[2]);
            sum += marks;
            count++;
        }
        System.out.println("Average marks: " +(sum/count));
        br.close();
    }
}
