package controlstatements.selection;

import java.util.Scanner;

public class LadderTest {

	/*
	 * ============= if-else ladder (else if) ===============
	 * 
	 * syntax :
	 * 
	 * if(condition-1){
	 * 
	 * }
	 * 
	 * else if(condition-2){
	 * 
	 * }
	 * 
	 * else if(condition-3){
	 * 
	 * }
	 * 
	 * else{
	 * 
	 * }
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Percentage");
		int marks = sc.nextInt();

		if (marks >= 80) {
			System.out.println("Distinction");
		}

		else if (marks >= 60) {
			System.out.println("First Division");
		}

		else if (marks >= 45) {
			System.out.println("Second Division");
		}

		else if (marks >= 32) {
			System.out.println("Third Division");
		}

		else {
			System.out.println("Failed");
		}
	}
}
