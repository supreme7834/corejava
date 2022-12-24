package exercise;

import java.util.Scanner;

public class IfTestSimpleInterest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Principal");
		int principal = sc.nextInt();
		
		System.out.println("Enter Time");
		int time = sc.nextInt();
		
		System.out.println("Enter Rate");
		int rate = sc.nextInt();
		
		if (principal != 0 && time != 0 && rate != 0) {
			int interest = principal * time * rate/100;
			
			System.out.println("Interest = "+interest);
		}
	}
}
