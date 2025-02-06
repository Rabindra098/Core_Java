package pack2;

public class person 
{
	String name;
	person()
	{
		this("Abdul Kalam sir");
		this.display();
	}
	person(String name)
	{
		this.name=name;
	}
	void display()
	{
		System.out.println("Person Name is :"+name);
	}
	public static void main(String[] args) 
	{
		new person();
	}
}
