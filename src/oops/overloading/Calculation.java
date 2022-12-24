package oops.overloading;

public class Calculation {

	void sum(int a, int b) {
		System.out.println("SUM = "+ (a + b));
	}

	void sum(int a, int b, int c) {
		System.out.println("SUM = "+ (a + b + c));
	}

	void sum(double a, float b) {
		System.out.println(a + b);
	}
	
	public static void main(String[] args) {
		
		Calculation xyz = new Calculation();
		xyz.sum(2, 5);
		xyz.sum(3, 4, 5);
		xyz.sum(2, 8);
	}
}
