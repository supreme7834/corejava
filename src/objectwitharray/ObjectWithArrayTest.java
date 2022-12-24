package objectwitharray;

import java.util.Arrays;
import java.util.Scanner;

public class ObjectWithArrayTest {
	/*
	 * 	syntax :
	 * 
	 * 		class_name[] array_name = new class_name[size];
	 * 
	 * 		e.g.
	 * 
	 *		// array of Employee
	 *		Employee[] emps = new Employee[30];
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		// create array of book(5)
		
		Book books[] = new Book[5];
		
		for (int i=0; i<books.length; i++) {
			
		Book b = new Book();
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter book name");
		b.setName(sc.next());
		
		System.out.println("Enter Author Name");
		b.setAuthor(sc.next());
		
		System.out.println("Enter Price");
		b.setPrice(sc.nextInt());
		
		System.out.println("Enter Pages");
		b.setPages(sc.nextInt());
		
		
		
//		b.setName("English");
//		b.setAuthor("S.P. Gupta");
//		b.setPrice(4500);
//		b.setPages(2000);
		
		books[i] = b;
		}
		
		printBooks(books);
		
		
		
//		// print array of books
//		System.out.println(Arrays.toString(books));
//		
//		// print selected books
//		
//		for(Book b1 : books) {
//			
//			// print Nepali books only
//			if(b1.getName().equals("Nepali")) {
//				System.out.println(b1);
//				
//			}
//			
//		}
		
		// print array of object as arguments
		}
		
		static void printBooks(Book books[]) {
			
			System.out.println(Arrays.toString(books));
		
	}

}
