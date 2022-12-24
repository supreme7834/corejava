package class_object_practice.level1;

public class Triangle {

	int a;
	int b;
	int c;

	// default constructor
	Triangle() {
		a = 3;
		b = 4;
		c = 5;

	}

	void printArea() {

		int area = (b * c) / 2;
		System.out.println("Area of Triangle = " + area);

	}

	void printPerimeter() {

		int perimeter = a + b + c;
		System.out.println("Perimeter of Triangle = " + perimeter);
	}

	public static void main(String[] args) {

		Triangle t = new Triangle();

		t.printArea();
		t.printPerimeter();
	}
}
