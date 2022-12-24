package class_object_practice.level1;

public class Level1Q3 {
	
	String name;
	int roll_no;
	String phone_no;
	String address;
	
	void printStudent() {
		
		System.out.println("Name : "+name);
		System.out.println("Roll No. : "+roll_no);
		System.out.println("Phone No. : "+phone_no);
		System.out.println("Address : "+address);
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Level1Q3 a = new Level1Q3();
		
		a.name = "Sam";
		a.roll_no = 3;
		a.phone_no = "9862907354";
		a.address = "Kathmandu";
		
		a.printStudent();
		
		Level1Q3 b = new Level1Q3();
		
		b.name = "John";
		b.roll_no = 2;
		b.phone_no = "234";
		b.address ="Kathmandu";
		
		b.printStudent();
		
	}

}
