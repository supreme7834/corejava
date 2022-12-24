package pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestProduct {

	
	public static void main(String[] args) {
		
		TestProduct testproduct = new TestProduct();
		
	Product[] products=new Product[3];
			Scanner s=new Scanner(System.in);
	
	for(int i=0;i<products.length;i++) {
		Product pro=new Product();
		System.out.println("\n enter id");
		pro.setId(s.nextLong());
		System.out.println("\n enter name");
		pro.setName(s.next());
		
		System.out.println("\n enter category");
		pro.setCategory(s.next());
		
		
		System.out.println("\n enter price");
		pro.setPrice(s.nextDouble());
	
		System.out.println("\n enter quantity");
		pro.setQuanatity(s.nextInt());
		
		products[i]=pro;
		
		
		
		
		
	}
		
	
	
	System.out.println(Arrays.toString(products));
	
	testproduct.totalPriceAndQuantity(products);
	testproduct.filterByCategory(products);
	testproduct.sortByPrice(products);
	
	
	
		
		
	}
	
	
	
	
	
	public void filterByCategory(Product[] p) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("\n enter category");
		String  filter=s.next();
		
		for(int i=0;i<p.length;i++) {
			
			
		if(filter.equals(p[i].getCategory())) {
			System.out.println(p[i].toString());
			
		}
		
		
		
		
		
		/*
		List<Product> listofsamecategory=new ArrayList<Product>();
		
		
		
		for(int i=0;i<p.length;i++) {
			
			for(int j=i;j<p.length;j++) {
				if(p[i].getCategory().equals(p[j].getCategory())){
					
					//Product poo=new Product();
					//poo=p[i];
					listofsamecategory.add(p[i]);
					
				}
				
				double sum=0;			
				for(Product pp:listofsamecategory) {
					System.out.println(pp.toString());
					sum=sum+pp.getPrice();
					
					
				}*/
				
				
				
			}
			
			
			
		
		
		
		
	}
	
	
	
	public void totalPriceAndQuantity(Product[] p) {
		
		int totalquantity = 0;
		double price=0;
		
		for(int i=0;i<p.length;i++) {
			totalquantity=p[i].getQuanatity()+totalquantity;
			price=price+p[i].getPrice();
			
			
			
			
		}
		
		System.out.println("\n totalprice:"+price+"\n totalquantity"+totalquantity);
		
		
	}
	
	public void sortByPrice(Product[] p) {
		
		
		 Product a=new Product();
		for(int i=0;i<p.length;i++) {
			
			
			for(int j=0;j<p.length;j++) {
				
				if(p[i].getPrice()<p[j].getPrice()) {
					
					a=p[j];
					p[j]=p[i];
					p[i]=a;
					
				}
				
				System.out.println("\n"+Arrays.toString(p));
				
			}
			
		}
		
		
	}
	
	
}
