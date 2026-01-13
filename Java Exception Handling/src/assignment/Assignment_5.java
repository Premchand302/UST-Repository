package assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment_5 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("sample.txt"));
			System.out.println(br.readLine());
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if(br != null) {
					br.close();
					System.out.println("File resource closed");
				}
			}
			catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
}
