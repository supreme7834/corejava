package exercise;

import java.util.Scanner;

public class PracticeAndDelete {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of books");
		int size = sc.nextInt();

		int price[] = new int[size];
		int sum = 0;
		int average = 0;

//		System.out.println("Enter Price of books");

		for (int i = 0; i < size; i++) {
			System.out.println("Enter Price of book ");
			price[i] = sc.nextInt();

			sum = sum + price[i];
			average = sum / size;
			
		}
		System.out.println("Total Price of Books = "+sum);
		System.out.println("Average Price of Books = "+average);
	}

}
