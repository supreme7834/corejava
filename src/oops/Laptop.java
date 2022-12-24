package oops;

public class Laptop {
	
	String brand;
	String model;
	int size;
	int ram;

	void printLaptop() {
		
		System.out.println("Brand = "+brand);
		System.out.println("Model = "+model);
		System.out.println("Screen Size = "+size+" inch ");
		System.out.println("RAM = "+ram+" GB");
		
	}
	
	public static void main(String[] args) {
		
		Laptop d = new Laptop();
		
		d.brand = "Lenovo";
		d.model = "Yoga";
		d.size = 14;
		d.ram = 8;
		
		d.printLaptop();
		
	}
}
