package Projects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Product_Inventory {

	private static final char[] Product = null;
	ArrayList<Object> al = new ArrayList<Object>();
	HashMap<Object, Object> hm = new HashMap<Object, Object>();

	public void addProduct(String productId, String productName, double price, int quantity) {
		// Add a product
		if (!hm.containsKey(productName)) {
			Product p = new Product(productId, productName, price, quantity);
			hm.put(productName, p);
			al.add(p);
			System.out.println("\nProduct added successfullu.\n");
		} else {
			System.out.println("\nProduct Id already exist!");
		}
	}

	// Remove a product
	public void removeProduct(int productId) {
		Product p = (Product) hm.remove(productId);
		if (p != null) {
			al.remove(p);
			System.out.println("\nProduct remove successfully.");
		} else {
			System.out.println("\nProduct not found");
		}
	}

	// Ubdate product quantity
	public void updateQuantity(int productId, int quantity) {
		Product p = (Product) hm.get(productId);
		if (p != null) {
			p.setQuantity(quantity);
			System.out.println("\nQuantity update successfully.");
		} else {
			System.out.println("\nProduct not found");
		}
	}

	// display details of a particular product
	public void displayProduct(int productId) {
		Product p = (Product) hm.get(productId);
		if (p != null) {
			System.out.println(Product);
		} else {
			System.out.println("\nProduct not found");
		}
	}

	// display details of All products
	public void displayAllproduct() {
		if (al.isEmpty()) {
			System.out.println("\nNo product in in Inventory");
		} else {
			for (Object p : al) {
				System.out.println(p);
			}
		}
	}

	// Main class with menu-driven interface
	public static void main(String[] args) {
		System.out.println("*********Product Inventory Management System**********");
		Scanner sc = new Scanner(System.in);
		Product_Inventory pi = new Product_Inventory();
		int choice;
		do {
			System.out.println("\n               1. Add Product");
			System.out.println("               2. Remove Product");
			System.out.println("               3. Update Product Quantity");
			System.out.println("               4. Display Product Details");
			System.out.println("               5. Display All Products");
			System.out.println("               6. Exit");
			System.out.print("\nEnter your choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1: {
				System.out.print("Enter Product ID: ");
				String productId = sc.nextLine();
				System.out.print("Enter Product Name: ");
				String productName = sc.nextLine();
				System.out.print("Enter Product Price: ");
				Double price = sc.nextDouble();
				System.out.print("Enter Quantity: ");
				int quantity = sc.nextInt();
				pi.addProduct(productId, productName, price, quantity);
				break;
			}
			case 2: {
				System.out.print("Enter Product ID to remove: ");
				int productId = sc.nextInt();
				pi.removeProduct(productId);
				break;
			}
			case 3: {
				System.out.println("Enter product Id for update : ");
				int productId = sc.nextInt();
				System.out.print("Enter new Quantity: ");
				int quantity = sc.nextInt();
				pi.updateQuantity(productId, quantity);
				break;
			}
			case 4: {
				System.out.print("\nEnter Product ID to display: ");
				int productId = sc.nextInt();
				pi.displayProduct(productId);
				break;
			}
			case 5: {
				pi.displayAllproduct();
				break;
			}
			case 6: {
				System.out.println("Exiting the system. Goodbye!");
				break;
			}
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		} while (choice != 6);
		sc.close();
	}
}
