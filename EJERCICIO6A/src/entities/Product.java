package entities;

public class Product {
	int id;
	String name;
	String description;
	double price;
	int stock;
	boolean shippingIncluded;
	
	public Product() {}
	
	public Product(int id, String name, String description, double price, int stock, boolean shippingIncluded) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stock = stock;
		this.shippingIncluded = shippingIncluded;
	}
	
	public Product(String name, String description, double price, int stock, boolean shippingIncluded) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.stock = stock;
		this.shippingIncluded = shippingIncluded;
	}

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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public boolean isShippingIncluded() {
		return shippingIncluded;
	}
	public void setShippingIncluded(boolean shippingIncluded) {
		this.shippingIncluded = shippingIncluded;
	}
}