package practice3;

public class Manager extends Employee {
	
	private String deptName;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
void print() {
	
//	printEmployee();
	super.printEmployee();
	
	System.out.println("Dept Name = "+getDeptName());
	
}

public static void main(String[] args) {
	
	Manager m1 = new Manager();
	
	m1.setEmpId(56);
	m1.setName("David");
	m1.setSsn("88888888");
	m1.setSalary(70000);
	m1.setDeptName("Finance");
	
	m1.print();
}
	

}
