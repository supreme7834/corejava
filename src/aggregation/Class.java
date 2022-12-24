package aggregation;

public class Class {
	
	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.setColor("Blue");
		c.setModel("Kia Soul");
		c.setPrice(600000);
		
		Employee emp = new Employee();
		emp.setId(146);
		emp.setName("Ram");
		emp.setSalary(500000);
		emp.setCar(c);
		
		System.out.println("Id = "+emp.getId());
		System.out.println("Name = "+emp.getName());
		System.out.println("========= CAR INFO ==========");
		
		System.out.println("Color = "+emp.getCar().getColor());
		System.out.println("Model = "+emp.getCar().getModel());
		System.out.println("Price = "+emp.getCar().getPrice());
		
		
	}

}
