package oops;

public class Dog {
	
	// properties
	
	String breed;
	int age;
	String color;
	int weight;
	
	// methods
	
	void printDog() {
		
		System.out.println("Breed = "+breed);
		System.out.println("Age = "+age);
		System.out.println("Color = "+color);
		System.out.println("Weight = "+weight+"kg");
		
	}
	
	public static void main(String[] args) {
		
		Dog a = new Dog();
		a.breed = "German Shepard";
		a.age = 4;
		a.color = "Brown/Black";
		a.weight = 30;
		
		a.printDog();
	}

}
