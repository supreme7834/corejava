package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		Book books[] = new Book[3];
		
		for (int i = 0; i<books.length; i++) {
			
			Book b = new Book();
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Book Name");
			b.setName(sc.next());
			
			System.out.println("Enter Price");
			b.setPrice(sc.nextInt());
			
			books[i] =b;
		}
		
	printBook(books);
	}
	
	static void printBook(Book books[]) {
		for(Book b1 : books) {
			if(b1.getName().equals("b")) {
				System.out.println(b1);
			}
		}
	}

}
