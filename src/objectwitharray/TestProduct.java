package objectwitharray;

import java.util.Arrays;
import java.util.Scanner;

public class TestProduct {

	public static void main(String[] args) {

		Product products[] = new Product[3];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < products.length; i++) {
			
			Product p = new Product();

//			p.setId(1);
//			p.setName("Guitar");
//			p.setCategory("Music");
//			p.setPrice(20000);
//			p.setQuantity(10);

			System.out.println("Enter Product Id");
			p.setId(sc.nextInt());
			
			System.out.println("Enter Product Name");
			p.setName(sc.next());
			
			System.out.println("Enter Product Category");
			p.setCategory(sc.next());
			
			System.out.println("Enter Product Price");
			p.setPrice(sc.nextInt());
			
			System.out.println("Enter Product Quantity");
			p.setQuantity(sc.nextInt());

			products[i] = p;
		}
		
		TestProduct t = new TestProduct();

		t.printProduct(products);
		t.filterCategory(products);
		t.getTotalQuantity(products);
		t.getTotalPrice(products);
		t.getPriceByCategory(products);
		
	}

	void printProduct(Product products[]) {
		System.out.println("\n-------------------------------------------------");
		System.out.println("Id" + "\t" + "Name" + "\t" + "Category" + "\t" + "Price" + "\t" + "Quantity");
		System.out.println("-------------------------------------------------");

		for (Product p1 : products) {
			System.out.println(p1.getId() + "\t" + p1.getName() + "\t" + p1.getCategory() + "\t\t" + p1.getPrice()
					+ "\t" + p1.getQuantity());
		}

	}

	void filterCategory(Product products[]) {
		System.out.println("\n\n-------------------------------------------------");
		System.out.println("Id" + "\t" + "Name" + "\t" + "Category" + "\t" + "Price" + "\t" + "Quantity");
		System.out.println("-------------------------------------------------");

		for (Product p2 : products) {

			if (p2.getCategory().equals("Music")) {
				System.out.println(p2.getId() + "\t" + p2.getName() + "\t" + p2.getCategory() + "\t\t" + p2.getPrice()
						+ "\t" + p2.getQuantity());
			}
		}

	}

	void getTotalQuantity(Product[] products) {
		int total = 0;

		for (Product p : products) {
			total = total + p.getQuantity();
		}
		System.out.println("\n\nTotal Quantity = " + total);
	}
	
	void getTotalPrice(Product[] products) {
		int total = 0;
		
		for(Product p : products) {
			total = total+ p.getPrice();
		}
		System.out.println("\nTotal Price = "+total);
	}
	
	void getPriceByCategory(Product[] products) {
		int total = 0;
		
		for(Product p : products) {
			
			if(p.getCategory().equals("Music")) {
				total = total+p.getPrice();	
			}
			
		}
		System.out.println("\nTotal Price of Music Products = "+total);
	}
	

}

