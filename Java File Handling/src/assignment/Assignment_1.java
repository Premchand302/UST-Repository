package assignment;

import java.io.FileWriter;
import java.io.IOException;

public class Assignment_1 {
	public static void main(String[] args){
		try {
		FileWriter writer = new FileWriter("students.csv");
		writer.write("id,name,marks\n");
		writer.write("101,Ravi,78\n");
		writer.write("102,Anita,85");
		
		writer.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
