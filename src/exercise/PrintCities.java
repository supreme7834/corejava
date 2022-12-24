package exercise;

import java.util.Arrays;

public class PrintCities {
	
	public static void main(String[] args) {
		
		String[] name = getCities();
		
		System.out.println(Arrays.toString(name));
		
	}
	
	static String[] getCities() {
		
		String[] city = {"Kathmandu", "Pokhara", "Biratnagar", "Dharan"};
		
		return city;
	}

}
