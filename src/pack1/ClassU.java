package pack1;

public class ClassU 
{
	int meth1()
    {
        System.out.println("hi");
        return new ClassU().meth2()+10;
    }    
    int meth2()
    {
        System.out.println("hello");
        return 90;
    }
    public static void main(String[] args) 
    {
        System.out.println(new ClassU().meth1()/2);    
    }
}
