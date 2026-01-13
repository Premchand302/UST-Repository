package assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Assignment_5 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader( new FileReader("students.csv"));
        String line;
        br.readLine();
        System.out.println("Enter a name:");
        String key = sc.nextLine();
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            if (key.equalsIgnoreCase(data[1])) {
                System.out.println("ID: " + data[0] +", Name: " + data[1] +", Marks: " + data[2]);
            }
        }

        br.close();
    }
}
