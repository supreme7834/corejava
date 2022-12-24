package exercise;

import java.util.Scanner;

public class IfTestArea {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length");
		int length = sc.nextInt();
		
		System.out.println("Enter breadth");
		int breadth = sc.nextInt();
		
		if (length !=0 && breadth !=0) {
			int area = length * breadth;
			
			System.out.println("Area ="+area);
		}
	}
}
