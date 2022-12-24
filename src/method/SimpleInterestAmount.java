package method;

import java.util.Scanner;

public class SimpleInterestAmount {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Principal");
		int a = sc.nextInt();
		
		System.out.println("Enter Time");
		int b = sc.nextInt();
		
		System.out.println("Enter Rate of Interest");
		int c = sc.nextInt();	
	
	int simple = processing(a, b, c);
	
	output(simple, a);
		
	}

	static int processing(int p, int t, int r) {
		
		int si = (p * t * r)/100;
		
		return si;
	}
	
	static void output(int simple, int a) {
		
		int amount = a + simple;
		
		System.out.println("Simple Interest = "+simple);
		System.out.println("Total Amount = "+amount);
	}
}
