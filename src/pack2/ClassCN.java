package pack2;
/*
 * Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" also count.

	countCode("aaacodebbb") ? 1
	countCode("codexxcode") ? 2
	countCode("cozexxcope") ? 2
	
	public int countCode(String str)
	{
	             // Write your logic here 
	}
 */
public class ClassCN 
{
	public int countCode(String str)
	{
		int count = 0;
	    for (int i = 0; i < str.length() - 3; i++) 
	    {
	        if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') 
	            count++;
	    }
	    return count;         
	}
	public static void main(String[] args) 
	{
		ClassCN aobj = new ClassCN();
		int result=aobj.countCode("codecodecodecope");
		System.out.println(result);
	}
}
