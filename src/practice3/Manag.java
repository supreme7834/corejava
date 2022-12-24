package practice3;

public class Manag extends Employ{
	
	private String deptName;
	
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	void printEmployee() {
		super.printEmployee();
		System.out.println("Dept. Name = "+deptName);
		
	}
	
	public static void main(String[] args) {
		
		Manag m = new Manag();
		m.setEmpId(42);
		m.setName("Supreme Shrestha");
		m.setSsn("234-456");
		m.setSalary(70000);
		m.setDeptName("Credit");
		
		m.printEmployee();
	}
}
