package assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment_10 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new FileReader("students.csv"));
        String line;
        br.readLine();
        int max = 0;
        String topper = "";
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            int marks = Integer.parseInt(data[2]);
            if (marks > max) {
            	max = marks;
            	topper = data[1];
            }
        }
        System.out.println("Topper: " +topper+ " ,Marks: "+max);
        br.close();
    }
}
