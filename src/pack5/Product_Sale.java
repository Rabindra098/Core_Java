package pack5;

public class Product_Sale 
{
	String Product_Name;
	double Product_Price;
	public Product_Sale(String product_Name, double product_Price) 
	{
		this.Product_Name = product_Name;
		this.Product_Price = product_Price;
	}
	@Override
	public String toString() 
	{
		return Product_Name+" => "+Product_Price;
	}
	
}
