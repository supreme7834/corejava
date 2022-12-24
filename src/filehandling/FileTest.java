package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class FileTest {

	public static void main(String[] args) throws IOException {
		
		File file = new File("d://product.txt");
		
		System.out.println(file.isDirectory());
		System.out.println(file.exists());
		
		File dir = new File("d://java6am");
		//create folder
		dir.mkdir();
		
		//get all file names from folder
		String[] fnames = dir.list();
//		System.out.println(Arrays.toString(fnames)); //print all file names inside java6am
		List<String> namelist = Arrays.asList(fnames);
		System.out.println(namelist.contains("customer.txt")); //search for customer.txt in java6am folder
		
		//get all files from folder
		File[] files = dir.listFiles();
		
		for(File f1: files) {
			
//			FileReader nfile = new FileReader(f1.getAbsolutePath());
//			BufferedReader bf = new BufferedReader(nfile);
//			String line;
//			
//			while ((line=bf.readLine()) != null) {
//				System.out.println(line);
//			}
			
			System.out.println(Files.readAllLines(Path.of(f1.getAbsolutePath())));
			
		}
	}
}
