package controlstatements.selection;

import java.util.Scanner;

public class NestedTest {
	
	/*
	 * =============== nested if-else ===================
	 * 
	 * syntax :
	 * 
	 * 	if(condition-1){
	 * 
	 * 			if(condition-2){
	 * 				
	 * 					if(condition-3){
	 * 		
	 * 					}else{
	 * 
	 * 			}else{
	 * 
	 * }else{
	 * 
	 * )
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Citizenship");
		String citizen = sc.next();
		
		System.out.println("Enter Age");
		int age = sc.nextInt();
		
		if (citizen.equals("nepali")) {
			
			if (age >= 18) {
				
				System.out.println("You can vote.");
				
			} else {
			
				System.out.println("You are under age.");
			}
			
		}else {
			
		System.out.println("Invalid citizenship");
		}
	}
	
}
