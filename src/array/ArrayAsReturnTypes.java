package array;

import java.util.Arrays;

public class ArrayAsReturnTypes {
	
	public static void main(String[] args) {
		
		int[] data = getArray();
		
		System.out.println(Arrays.toString(data));
		
		
		// System.out.println(Arrays.toString(getOddNumsFrom1to100()));
		
		int [] odd = getOddNumsFrom1to100();
		
		System.out.println(Arrays.toString(odd));
		
	}
	
	//array as return type
	static int[] getArray() {
		
		int values[] = {23,546,24,325,456,123,345,456};
		
		return values;
	}
	
	static int[] getOddNumsFrom1to100() {
		
		int oddnos[] = new int[50];
		int j = 0;
		
		for(int i=1; i <100; i++) {
		
			if(i%2 != 0) {
				
				oddnos[j]=i;
				j++;
				
			}
		}
		
		return oddnos;
	}

}
