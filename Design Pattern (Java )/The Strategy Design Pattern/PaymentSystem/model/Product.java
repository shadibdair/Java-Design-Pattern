package model;

public class Product {
	private String upcCode;
	private int price;
	
	// constructor
	public Product(String upcCode, int price) {
		this.upcCode = upcCode;
		this.price = price;
	}
	public String getUpcCodeString() {
		return upcCode;
	}
	public void setUpcCodeString(String upcCodeString) {
		this.upcCode = upcCodeString;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
