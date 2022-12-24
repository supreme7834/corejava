package objectwitharray;

public class Book {
	
	private String name;
	private String author;
	private int price;
	private int pages;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	@Override
	public String toString() {
		return " \n Book [name=" + name + ", author=" + author + ", price=" + price + ", pages=" + pages + "]";
	}
	
	

}
