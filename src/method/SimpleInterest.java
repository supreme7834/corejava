package method;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		input();
	}

	static void input() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Principal");
		int p = sc.nextInt();

		System.out.println("Enter Time");
		int t = sc.nextInt();

		System.out.println("Enter Rate of Interest");
		int r = sc.nextInt();

		processing(p,t,r);
	}

	static void processing(int p, int t, int r) {

		int si = (p * t * r) / 100;

		int amount = p + si;
		
		output(si, amount);
	}

	static void output(int si, int amount) {

		System.out.println("Simple Interest = " + si);
		System.out.println("Total Amount = " + amount);
	}

}
