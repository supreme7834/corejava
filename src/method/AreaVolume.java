package method;

import java.util.Scanner;

public class AreaVolume {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Length");
		int length = sc.nextInt();

		System.out.println("Enter Breadth");
		int breadth = sc.nextInt();

		System.out.println("Enter Height");
		int height = sc.nextInt();

		int x = getArea(length, breadth);

		volume(x, height);
	}

	static int getArea(int l, int b) {

		int area = l * b;

		return area;

	}

	static void volume(int x, int height) {

		int v = x * height;

		System.out.println("AREA = " + x);
		System.out.println("VOLUME = " + v);
	}

}
