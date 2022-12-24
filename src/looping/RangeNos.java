package looping;

import java.util.Scanner;

public class RangeNos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Start Value");
		int start = sc.nextInt();

		System.out.println("Enter End Value");
		int end = sc.nextInt();

		for (int i = start; i <= end; i++) {

			System.out.println(i);
		}
	}

}
