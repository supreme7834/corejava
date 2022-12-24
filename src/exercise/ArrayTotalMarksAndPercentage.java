package exercise;

public class ArrayTotalMarksAndPercentage {
	
	public static void main(String[] args) {
		
		String subject[] = {"English", "Nepali", "Maths", "Science", "Accounts", "History", "Geography"};
		int marks[] = {85, 92, 75, 69, 77, 80, 74};
		
		int sum = 0;
		int percentage = 0;
		
		for(int i = 0; i< 7; i++) {
			sum = sum + marks[i];
			percentage = sum / 7;
		}
		System.out.println("SUBJECTS              MARKS");
		System.out.println("---------------------------");
		
		for(String x : subject) {
			
			System.out.println(x);
//			System.out.println((x)+"               "+(y));
			}
		
		
		
		System.out.println("TOTAL MARKS = "+sum);
		System.out.println("PERCENTAGE = "+percentage+"%");
	}

}
