package exercise;

import java.util.Scanner;

public class IfInterest {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Principal");
	int p = sc.nextInt();
	
	System.out.println("Enter Time");
	int t = sc.nextInt();
	
	System.out.println("Enter Interest Rate");
	int r = sc.nextInt();
	
	if (p != 0 && t != 0 && r != 0) {
		int interest = p * t * r/100;
		
		System.out.println("Interest = "+interest);
		
	}

	}


}
