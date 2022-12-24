package array;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		// create array
		
		int age[] = new int[5];	
		
		//write data in array
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
		
		System.out.println("Enter your age");
		age[i] = sc.nextInt();
		}
		
		//read date in array
		
//		for(int x =0; x<3; x++) {		//one method to print output
//		System.out.println(age[x]);
//		}
		
		for(int x : age) {				//another method to print output
			System.out.println(x);
		}
		
	}

}
