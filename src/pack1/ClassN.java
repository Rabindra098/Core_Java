package pack1;

public class ClassN 
{
	 void meth1(int x,int y,int z)
	    {
	        System.out.println(10);
	        new ClassN().meth2("hi",100);
	        System.out.println(10+x);
	        System.out.println(y);
	        System.out.println(10-z);
	    }    
	    void meth2( String s, int num)
	    {
	        System.out.println(s);
	        System.out.println(num-20);
	        System.out.println(num);
	    }
	    void meth3(char c, int x,String s)
	    {
	        System.out.println(c);
	        new ClassN().meth1(5,10,6);
	        System.out.println(x/2);
	        System.out.println(30);
	        System.out.println(s);
	    }
	    public static void main(String[] args) 
	    {
	        System.out.println("Start");
	        new ClassN().meth3('x', 50, "hello");
	        System.out.println("End");    
	    }
}
