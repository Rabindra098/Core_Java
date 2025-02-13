//Exception Handling throw vs throws
package pack5;

import java.io.FileReader;

public class throws_Exception 
{
	int avl_amt=5000;
	void meth1(int wd_amt)
	{
		if (avl_amt<wd_amt) 
		{
			throw new ArithmeticException("Insufficient balance");
		} 
		else 
		{
			System.out.println("Transaction success");
			System.out.println("please take your withdrowl amount :"+wd_amt);
			System.out.println("Your avelable balance is :"+(avl_amt-wd_amt));
		}
	}
	void meth2() throws Exception
	{
		System.out.println("meth2() called");
		FileReader fr=new FileReader("C:\\\\Users\\\\ADMIN\\\\OneDrive\\\\Desktop\\\\java\\\\Nit\\\\file1.txt");
		System.out.println("Connection Created");
		fr.close();
	}
	public static void main(String[] args) throws Exception
	{
		throws_Exception aobj = new throws_Exception();
		aobj.meth1(56);
		aobj.meth2();
	}
}
