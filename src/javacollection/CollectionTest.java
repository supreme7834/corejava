package javacollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionTest {
	
	public static void main(String[] args) {
		
	List<Integer> list = Arrays.asList(12,64,68,76,99,7,63,54,14,24,3);
	
	System.out.println(list);
	
	Collections.reverse(list);
	System.out.println(list);
	
	Collections.sort(list);
	System.out.println(list);
	
	Collections.sort(list,Collections.reverseOrder());
	System.out.println(list);
	
	Collections.fill(list, 80);
	System.out.println(list);
	}
}
