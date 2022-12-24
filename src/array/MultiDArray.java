package array;

import java.util.Iterator;
import java.util.Scanner;

public class MultiDArray {
	
	/*
	 * =================== MultiDArray===================
	 * #used to represent data in the form of row and columns.
	 * 
	 * syntax:
	 * 
	 * 	data_type array_name[][] = new data_type[row][col];
	 */

	public static void main(String[] args) {
		
		int mat[][] = new int [2][2];
		/*
		 * 		C0 C1
		 * R0  	[] []
		 * R1	[] []
		 */
		
		// write data in multiDArray
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<2; i++) {
			
			for(int j=0; j<2; j++) {
				
				System.out.println("Enter value of mat");
				mat[i][j] = sc.nextInt();
				//mat[i][j]=45;
			}
		}
		
		//read data from multiDArray
		for(int i=0; i<2; i++) {
			
			for(int j=0; j<2; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
