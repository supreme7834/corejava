package objectwithmethod;

public class Test {
	
//	# FOR OBJECT AS ARGUMENTS
	
//public static void main(String[] args) {
//		
//		Product prod = new Product();
//		
//		prod.setId(4538);
//		prod.setName("Tv");
//		prod.setPrice(60000);
//		prod.setCompany("Sony");
//		
//		Test t = new Test();
//		
//		t.printProduct(prod); // call for object as argument
//		
//		}
//	
//	
//	//object as arguments
//	void printProduct(Product p) {
//		
//		System.out.println("Id = "+p.getId());
//		System.out.println("Name = "+p.getName());
//		System.out.println("Price = "+p.getPrice());
//		System.out.println("Company = "+p.getCompany());
//	}
	
//	# FOR OBJECT AS RETURN TYPE
	
	public static void main(String[] args) {
	
	Product prod = new Product();
	
	prod.setId(4538);
	prod.setName("Tv");
	prod.setPrice(60000);
	prod.setCompany("Sony");
	
	Test t = new Test();
	
	t.printProduct(prod); // call for object as argument
	
	Product x = t.getProduct();	//call for object as return type
	t.printProduct(x);
	
	
}


//object as arguments
void printProduct(Product p) {
	
	System.out.println("Id = "+p.getId());
	System.out.println("Name = "+p.getName());
	System.out.println("Price = "+p.getPrice());
	System.out.println("Company = "+p.getCompany());
}

// object as return type

Product getProduct() {
	
	Product prod = new Product();
	
	prod.setId(4538);
	prod.setName("Tv");
	prod.setPrice(60000);
	prod.setCompany("Sony");
	
	return prod;
}


}
