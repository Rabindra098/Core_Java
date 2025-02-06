package pack1;

public class ClassI 
{
	int x=25;
    int y=36;
    void meth1()
    {
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        new ClassI().meth4();
        System.out.println(x/y);
    }  
    int a=47;
    int b=95;
    void meth2()
    {
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    } 
    void meth3()
    {
        System.out.println(a+x);
        System.out.println(a-x);
        new ClassI().meth1();
        System.out.println(a*x);
        System.out.println(a/x);
    }
    void meth4()
    {
        System.out.println(b+y);
        new ClassI().meth2();
        System.out.println(b-y);
        System.out.println(b*y);
        System.out.println(b/y);
    }
    
    public static void main(String[] args) 
    {
        System.out.println("Start");
        new ClassI().meth3();
        System.out.println("End");
    }
}
