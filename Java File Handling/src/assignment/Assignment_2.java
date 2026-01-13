package assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment_2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("students.csv"));
		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}
}
