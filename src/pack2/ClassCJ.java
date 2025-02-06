package pack2;
/*
 * Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".

	firstTwo("Hello") ? "He"
	firstTwo("abcdefg") ? "ab"
	firstTwo("ab") ? "ab"
	
	public String firstTwo(String str)
	{
	// Write your logic here
	}
 */
public class ClassCJ 
{
	public String firstTwo(String str)
	{
		if(str.length()>=2)
			return str.substring(0,2);
		else 
			return str.substring(0);
	}
	public static void main(String[] args) 
	{
		ClassCJ aobj = new ClassCJ();
		String result=aobj.firstTwo("Hello");
		System.out.println(result);
	}
}
