package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileTest {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter file = new FileWriter("d://product.txt",true);
		
		file.write("\nId = 9878\n");
		file.write("Name = TV\n");
		file.write("Company = Sony\n");
		file.write("Price = 50000\n");
		file.write("Quantity = 200\n");
		
		file.close();
		System.out.println("success");
		
	}

}
