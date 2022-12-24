package class_object_practice.level1;

public class Employee {

	String name;
	int year_of_joining;
	int salary;
	String address;

	void printEmployee() {

		System.out.println(name + "\t" + year_of_joining + "\t\t" + salary + "\t" + address);

	}

	public static void main(String[] args) {

		System.out.println("Name" + "\t" + "Year of joining" + "\t" + "Salary" + "\t" + "Address");

		Employee e1 = new Employee();
		e1.name = "Robert";
		e1.year_of_joining = 1994;
		e1.salary = 24000;
		e1.address = "64C-WallsStreat";

		e1.printEmployee();

		Employee e2 = new Employee();
		e2.name = "Sam";
		e2.year_of_joining = 2000;
		e2.salary = 36000;
		e2.address = "68D-WallsStreat";

		e2.printEmployee();

		Employee e3 = new Employee();
		e3.name = "John";
		e3.year_of_joining = 1999;
		e3.salary = 36000;
		e3.address = "26B-WallsStreat";

		e3.printEmployee();

	}

}
