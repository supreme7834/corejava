package class_object_practice.level1;

import java.util.Scanner;

public class Area {

	static void setDim() {
		int length;
		int breadth;
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Length");
		length = sc.nextInt();

		System.out.println("Enter Breadth");
		breadth = sc.nextInt();

		getArea(length, breadth);

	}

	static void getArea(int length, int breadth) {

		int area = length * breadth;
		
		System.out.println("Area = "+area);

	}

	public static void main(String[] args) {

		setDim();
	}

}
