package practice3;

public class Employ {
	
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
	
	void raiseSalary(double increase) {
		
	}
	
	void printEmployee() {
		System.out.println("Emp Id = "+getEmpId());
		System.out.println("Name = "+getName());
		System.out.println("Ssn = "+getSsn());
		System.out.println("Salary = "+getSalary());
	}
	
	public static void main(String[] args) {
		
		Employ e = new Employ();
		e.setEmpId(23);
		e.setName("Supreme");
		e.setSsn("23423-23523");
		e.setSalary(50000);
		
		e.printEmployee();
	}

}
