package pack2;
/*
 7)	 Write a program to check whether an entered character is lowercase (a to z ) or uppercase ( A to Z ).
     Take a parameterized method which takes a single "character" as an input.
 */
public class ClassAK 
{
	void CheakCase(char ch)
	{
		if (ch>='a' && ch<='z') 
		{
			System.out.println(ch+" is Lowercase");
		}
		else if (ch>='A' && ch<='Z') 
		{
			System.out.println(ch+" is Uppercase");
		}
		else 
		{
			System.out.println(ch+" is not a Leter");
		}
	}
	public static void main(String[] args) 
	{
		ClassAK aobj = new ClassAK();
		aobj.CheakCase('0');
	}
}
