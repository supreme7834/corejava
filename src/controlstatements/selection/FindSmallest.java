package controlstatements.selection;

import java.util.Scanner;

public class FindSmallest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value A");
		int a = sc.nextInt();
		
		System.out.println("Enter value B");
		int b = sc.nextInt();
		
		if (a < b) {
			System.out.println("A is the smallest number.");
		
		}else { 
			System.out.println("B is the smallest number.");
			
			
		}
	}

}
