package pack2;
/*
 * Given a string, return a string where for every char in the original, there are two chars
	doubleChar("The") ? "TThhee"
	doubleChar("AAbb") ? "AAAAbbbb"
	doubleChar("Hi-There") ? "HHii--TThheerree"
	
	public String doubleChar(String str)
	{ 
	// Write ur logic here
	}
 */
public class ClassCL 
{
	public String doubleChar(String str)
	{ 
		String s="";
		for (int i = 0; i < str.length(); i++) 
		{
			s=s+str.charAt(i)+str.charAt(i);
		}
		return s;
	}
	public static void main(String[] args) 
	{
		ClassCL aobj = new ClassCL();
		String result=aobj.doubleChar("the");
		System.out.println(result);
	}
}
