package array;

public class ArrayWithMethod {
	/*
	 * ====================Array With Method=======================
	 * a> array as argument:
	 * 
	 * void sum(int a[]{
	 * 
	 * }
	 * 
	 * sum(array);
	 * 
	 * 
	 * b> array as return type:
	 * 
	 * int[] getValue(){
	 * 
	 * //10,45,234,456,234,4564,....300th
	 * 
	 * return array;
	 * 
	 * }
	 * 
	 */

	public static void main(String[] args) {
		
		int data[] = {234,372,4357,546,456,23,457,56245,245645,456,45,56,675};
		sum(data);
	}
	
	//array as argument
	static void sum(int values[]) {
		
		int sum = 0;
		
		for(int x : values) {
			sum = sum + x;
		}
		
		System.out.println("Total = "+sum);
	}
	
}











