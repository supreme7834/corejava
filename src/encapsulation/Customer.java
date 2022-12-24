package encapsulation;

class Customer {
	// POJO OR MODEL OR ENTITY CLASS :

	private int id;
	private String name;
	private String city;
	private int age;
	private String phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return " Id = " + id + ",\n Name = " + name + ",\n City = " + city + ",\n Age = " + age + ",\n Phone = " + phone + " ";
	}

}
