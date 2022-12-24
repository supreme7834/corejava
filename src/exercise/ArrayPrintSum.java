package exercise;

public class ArrayPrintSum {

	public static void main(String[] args) {

		int numbers[] = {10, 20, 30, 44, 75, 90, 200, 707};
		int sum = 0;

		for (int i = 0; i < 8; i++) {

			sum = sum + numbers[i];
		}

		System.out.println("Total Sum = " + sum);

	}

}
