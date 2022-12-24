package class_object_practice.level1;

public class ParameterizedTriangle {
	
	int a;
	int b;
	int c;
	
	// parameterized constructor
	ParameterizedTriangle(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	void printArea() {
		int area = (b*c)/2;
		System.out.println("Area of Triangle = "+area);
	}
	
	void printPerimeter() {
		int perimeter = a+b+c;
		System.out.println("Perimeter of Triangle = "+perimeter);
	}
	
	public static void main(String[] args) {
		ParameterizedTriangle t = new ParameterizedTriangle(3, 4, 5);
		t.printArea();
		t.printPerimeter();
	}

}
