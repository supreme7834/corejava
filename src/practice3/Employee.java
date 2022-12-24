package practice3;

class Employee {

	private int empId;
	private String name;
	private String ssn;
	private double salary;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
//	void raiseSalary(double increase) {
//	increase = 10000;
//}
	
	void printEmployee() {
		
		System.out.println("Emp Id = "+getEmpId());
		System.out.println("Name = "+getName());
		System.out.println("Ssn = "+getSsn());
		System.out.println("Salary = "+getSalary());
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setEmpId(23);
		e1.setName("Supreme");
		e1.setSsn("7777777");
		e1.setSalary(50000);
		
		e1.printEmployee();
		
//		System.out.println("Emp Id = "+e1.getEmpId());
//		System.out.println("Name = "+e1.getName());
//		System.out.println("Ssn = "+e1.getSsn());
//		System.out.println("Salary = "+e1.getSalary());
	}
	

	

	
}
