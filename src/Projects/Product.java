package Projects;

public class Product {
	String productId;
	String productName;
	double price;
	int quantity;

	public Product(String productId, String productName, double price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public String getproductId() {
		return productId;
	}

	public String getproductName() {
		return productName;
	}

	public double getprice() {
		return price;
	}

	public int setQuantity(int quantity) {
		return quantity;
	}

	@Override
	public String toString() {
		return "\nProduct ID : " + productId + "  Name : " + productName + "  Price : " + price + "  Quantity : "
				+ quantity;
	}
}
