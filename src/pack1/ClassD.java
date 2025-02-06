package pack1;

public class ClassD 
{
	 void meth1 ()
	    {
	        System.out.println("meth1 () calling");
	        int i = 100;
	        System.out.println("i");
	        System.out.println(i);
	        System.out.println("i :"+i);
	        System.out.println(i+i);
	        System.out.println("i :"+99);
	        System.out.println(i+99);
	    }
	    public static void main(String[] args)
	    {
	        System.out.println("Start");
	        ClassD aobj=new ClassD();
	        aobj.meth1 ();
	        System.out.println("End");
	    }
}
