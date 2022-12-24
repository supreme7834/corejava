package exercise;

import java.util.Scanner;

public class PrimeNumbersInRange {

//	Q2> WAP to print prime numbers between given range

	public static void main(String[] args) {
		int i, j, count;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Start number");
		int start = sc.nextInt();
		
		System.out.println("Enter End number");
		int end = sc.nextInt();
		
		for (i=start; i<=end; i++) {
			count=0;
			
		
		for (j=2; j<=i/2; j++) {
			
			if (i%j ==0) {
			count=1;
			break;
				
			}
		}
			if(count==0)
				
			System.out.println(i+"");
			
		}
	
	}

}
