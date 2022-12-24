package encapsulation;

public class Test {
	
	public static void main(String[] args) {
		
		Customer c = new Customer();
		
		c.setId(23);
		c.setName("Dave");
		c.setCity("Kathmandu");
		c.setAge(30);
		c.setPhone("9862907354");
		
		System.out.println(c);
		
//		System.out.println("Id = "+c.getId());
//		System.out.println("Name = "+c.getName());
//		System.out.println("City = "+c.getCity());
//		System.out.println("Age = "+c.getAge());
//		System.out.println("Phone = "+c.getPhone());
		
	}

}
