package pack2;
/*
	Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
	helloName("Bob") ? "Hello Bob!"
	helloName("Alice") ? "Hello Alice!"
	helloName("X") ? "Hello X!"
	
	public String helloName(String name)
	{
	    // write ur logic here
	}
 */
public class ClassCF 
{
	public String helloName(String name)
	{
		return "Hello "+name+"!";
	}
	public static void main(String[] args) 
	{
		ClassCF aobj = new ClassCF();
		String 	result=aobj.helloName("Bob");
		System.out.println(result);
	}
}
