package pratice;

public class Product {

	private Long id;
	private String name;
	private String category;
	private double price;
	private int quanatity;
	
	public Product() {
		
		
	}
	public Product(Long id, String name, String category, double price, int quanatity) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.quanatity = quanatity;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuanatity() {
		return quanatity;
	}
	public void setQuanatity(int quanatity) {
		this.quanatity = quanatity;
	}
	@Override
	public String toString() {
		return "\nPratice [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + ", quanatity="
				+ quanatity + "]";
	}
	
	
	
	
	
	
}
