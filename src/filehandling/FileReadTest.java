package filehandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadTest {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("d://test.txt");
		BufferedInputStream br = new BufferedInputStream(file);
		
		int data;
//		while((data=file.read()) != -1) {
		while((data=br.read()) != -1) {
			
			System.out.print((char)data);
		}
		
	}
	
}
