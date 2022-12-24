package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadUsingReader {
	
	public static void main(String[] args) throws IOException {
		
		FileReader file = new FileReader("d://csvdemo.csv");
		BufferedReader bf = new BufferedReader(file);
		
		String line;
//		bf.readLine();
		
		while((line=bf.readLine()) != null) {
//			System.out.println(line);
			
			String[] words = line.split(",");
			System.out.println(words[2]);
			
			//insert these data in db
		}
		
		bf.close();
		file.close();
		
	}

}
