package pack2;
/*
 * Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.

	extraEnd("Hello") ? "lololo"
	extraEnd("ab") ? "ababab"
	extraEnd("Hi") ? "HiHiHi"
	
	public String extraEnd(String str)
	{
	// Write your logic here
	}
 */

public class ClassCI 
{
	public String extraEnd(String str)
	{
		String s=str.substring(str.length()-2);
		return s+s+s;
	}
	public static void main(String[] args) 
	{
		ClassCI aobj = new ClassCI();
		String result=aobj.extraEnd("Hello");
		System.out.println(result);
	}
}
