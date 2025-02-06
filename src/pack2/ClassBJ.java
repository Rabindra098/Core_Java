package pack2;

import java.util.Iterator;

public class ClassBJ 
{
	void meth1()
	{
		boolean flag[]= {true,false,true,true,false};
		System.out.println("Printing forward");
		for (boolean b : flag) 
		{
			System.out.print(b+" ");
		}
		
		System.out.println("\nPrinting reverse");
		for (int i = flag.length - 1; i >= 0; i--) 
		{
	        System.out.print(flag[i]+" ");
	    }
	}
	public static void main(String[] args) 
	{
		new ClassBJ().meth1();
	}
}