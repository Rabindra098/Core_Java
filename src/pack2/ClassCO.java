package pack2;

public class ClassCO 
{
	void meth1(String ward)
	{
		String rev="";
		for (int i = ward.length()-1; i >= 0; i--) 
		{
			rev=rev+ward.charAt(i);
		}
		System.out.println("ward :"+ward);
		System.out.println("rev :"+rev);
		if (ward.equals(rev)) 
			System.out.println("ward is a palendrom");
		else 
			System.out.println("ward is not a palendrom");
	}
	public static void main(String[] args) 
	{
		ClassCO aobj = new ClassCO();
		aobj.meth1("itamati");
	}
}
