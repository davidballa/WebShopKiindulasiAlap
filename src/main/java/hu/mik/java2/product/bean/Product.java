package hu.mik.java2.product.bean;

public class Product {
	private int categoryID;
	private String productName;
	private int price;
	private String description;
	private int discount;
	
	public int getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	@Override
	public String toString() {
		return "Product [CategoryID=" + categoryID + ", ProductName=" + productName + ", price=" + price
				+ ", description=" + description + ", discount=" + discount + "]";
	}
	
}
