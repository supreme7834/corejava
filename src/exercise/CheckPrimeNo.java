package exercise;

import java.util.Scanner;

public class CheckPrimeNo {

	// Q1> WAP to print check prime numbers

	public static void main(String[] args) {

		int num, count = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number.");
		num = sc.nextInt();

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {

				count++;
				break;
			}
		}

		if (count == 0) {
			System.out.println(num + " is a prime number.");

		} else {
			System.out.println(num + " is not a prime number.");
		}

	}

}
