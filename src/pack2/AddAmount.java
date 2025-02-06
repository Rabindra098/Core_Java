package pack2;

public class AddAmount 
{
	int amount=500;
	public AddAmount()
	{
		System.out.println("My Initial Balance :"+amount);
	}
	public AddAmount(int depositamount) 
	{
		System.out.println("My final Balance after deposit :"+(depositamount+amount));
		
	}
	public static void main(String[] args) 
	{
		AddAmount aobj = new AddAmount();
		AddAmount bobj = new AddAmount(300);
	}
}
