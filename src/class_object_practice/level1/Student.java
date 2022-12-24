package class_object_practice.level1;

public class Student {
	
	String name;
	int roll_no;
	
	void printStudent() {
		
		System.out.println("Name : "+name);
		System.out.println("Roll No. : "+roll_no);
		
	}
	
	public static void main(String[] args) {
		
		Student a = new Student();
		
		a.name = "John";
		a.roll_no = 2;
		
		a.printStudent();
		
	}

}
