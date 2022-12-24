package looping;

public class SumofEnhanceForTest {
/*
 * =========== Enhance For Loop (forEach) ==============
 * 
 * #used to read data from collection.
 * 
 * syntax:
 * 
 * 	for(data_type var : collection){
 * 
 * 		//statements
 * 
 * }
 
 */
	public static void main(String[] args) {
		 
		int values[] = {9,87,65,45,6,7,8,6,572,34,56,76,45,34,2};
		
		int sum = 0;
		
			for(int x : values) {
				System.out.println(x);
				
				sum = sum + x;
			}
			
			System.out.println("Total = "+sum);
	}
	
}
