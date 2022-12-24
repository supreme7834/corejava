package array;

import java.util.Scanner;

public class SumAndAverageOfBookPrice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of books");
		int size = sc.nextInt();

		int price[] = new int[size];
		int sum = 0;
		int average = 0;

		System.out.println("Enter book price");

		for (int i = 0; i < size; i++) {
			price[i] = sc.nextInt();

			sum = sum + price[i];
			average = sum / size;
		}

		System.out.println("Total Sum of Books Price = " + sum);
		System.out.println("Average of Books Price = " + average);

	}
}
