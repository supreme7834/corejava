package oops;

public class Book {
	
	// properties
		String name;
		int price;
		String author;
		int pages;
	
	
	// methods
		
		void printBook() {
			
			System.out.println("Name = "+name);
			System.out.println("Price = "+price);
			System.out.println("Author = "+author);
			System.out.println("Pages = "+pages);
		}
		
		public static void main(String[] args) {
			
			Book b = new Book();
			b.name = "English";
			b.price = 3500;
			b.author = "S.K. Gupta";
			b.pages = 200;
			
			b.printBook();
			
			Book c = new Book();
			c.name = "Science";
			c.price = 1000;
			c.author = "Supreme";
			c.pages = 360;
			
			c.printBook();
		}

}
