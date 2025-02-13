package pack5;

public class MinAccBal extends Exception 
{
	String msg;
	public MinAccBal(String msg)
	{
		this.msg=msg;
	}
	public String toString() 
	{
		return msg;
	}
}
