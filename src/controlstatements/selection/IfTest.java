 package controlstatements.selection;

import java.util.Scanner;

public class IfTest {

	/*
	 * ========= if =========
	 * # used to implement single condition
	 * 
	 * syntax :
	 * 
	 * 		if(condition){
	 * 			
	 * 			//statements
	 * }
	 * 
	 */
	
	public static void main(String[] args) {
		
		int salary;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your salary ");
		
		salary = sc.nextInt();
		
		
		if(salary < 30000) {
				salary = salary + 8000;
		}
		
		System.out.println("Total Salary = "+salary);
	}
}
