package exercise;

import java.util.Scanner;

public class SalaryCalculationSwitchTest {
	
	/*
	 * Q3> WAP to calculate Total Salary as :
	 * 
	 * 		Post	Basic Salary	Bonus	Total Salary
	 * 		----	------------	-----	------------
	 * 		MD		250000			23.98%		?
	 * 		CEO		367000			17%			?
	 * 		MANAGER	168000			8.9%		?
	 * 		HELPER	80000			15.75%		?
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER A POST");
		System.out.println("** in block letters only **");
		String post = sc.next();
		
		switch(post) {
		
		case "MD" :
		System.out.println("Total Salary = 309950");
		break;
		
		case "CEO" :
		System.out.println("Total Salary = 429390");
		break;
		
		case "MANAGER" :
		System.out.println("Total Salary = 182952");
		break;
		
		case "HELPER" :
		System.out.println("Total Salary = 92600");	
		break;
		
		default :
		System.out.println("Invalid Input");
		
		}
		
	}
}
