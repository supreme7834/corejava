package inheritance;

public class Car extends Vehicle{

		private int cc;
		private int gears;
		
		public void attributesCar() {
			// This subclass refers to the members of superclass
			
			// System.out.println("Color of Car : "+color);  // ERROR: private field: color
			
			System.out.println("Speed of Car : "+speed); //super.speed or speed
			System.out.println("Size of Car : "+size);
			System.out.println("CC of Car : "+cc);
			System.out.println("Gears of Car : "+gears);
			
			attributes(); // super.attributes(); //WE CAN USE Super in any non static method.
			
			
		}
		
		public static void main(String[] args) {
			
			Car c1 = new Car();
			
			c1.speed = 200;
			c1.size = 22;
			c1.cc = 1000;
			c1.gears = 5;
			
			c1.attributes();
			
			// super.attributes(); // ERROR: Cannot use super in a static context
			
			c1.attributesCar();
			
			
		}
}
