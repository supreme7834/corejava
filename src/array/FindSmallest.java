package array;

public class FindSmallest {

	public static void main(String[] args) {

		int data[] = { 12, 234, 345, 123, 46, 23, 356, 123, 346, 57 };
		findSmallestValue(data);
	}

	static void findSmallestValue(int array[]) {

		int sv = array[0];

		for (int x : array) {

			if (sv > x)
				sv = x;
		}

		System.out.println("Smallest Value = " + sv);
	}

}
