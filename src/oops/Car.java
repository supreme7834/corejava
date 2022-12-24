package oops;

public class Car {

	// properties
	String company;
	String model;
	int year;
	int price;
	
	// methods
	
	void printCar() {
		
		System.out.println("Company = "+company);
		System.out.println("Model = "+model);
		System.out.println("Year = "+year);
		System.out.println("Price = "+price);
		
		}
	
	public static void main(String[] args) {
		
		Car a = new Car();
		a.company = "Kia";
		a.model = "Soul";
		a.year = 2014;
		a.price = 5400000;
		
		a.printCar();
		
		Car b = new Car();
		b.company = "Volkswagen";
		b.model	= "Polo";
		b.year = 2021;
		b.price = 3200000;
		
		b.printCar();
	}
	
}
