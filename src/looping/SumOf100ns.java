package looping;

public class SumOf100ns {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			
			System.out.println(i);
			sum = sum + i;
		}
		
		System.out.println("Total ="+sum);
	}
}
