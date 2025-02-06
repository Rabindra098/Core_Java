package pack1;

public class ClassO 
{
	int meth1()
    {
        System.out.println("meth1() calling");
        return 99;
    }
    public static void main(String[] args) 
    {
        System.out.println("Start");
        int x = 100;
        ClassO aobj=new ClassO();
        int data = aobj.meth1();
        System.out.println("x :"+x);
        System.out.println("data :"+data);
        System.out.println("End");
    }    
}
