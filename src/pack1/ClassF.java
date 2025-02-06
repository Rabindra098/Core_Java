package pack1;

public class ClassF 
{
	void meth1 ()
    {
        ClassF aobj=new ClassF();
        aobj.meth5();
        int a = 10;
        System.out.println(10);
        System.out.println(54+a);
    }
    void meth2 ()
    {
        int a = 20;
        System.out.println(78-a);
    } 
    void meth3 ()
    {
        int a =30;
        ClassF aobj=new ClassF();
        System.out.println(89+1);
        aobj.meth1();
        System.out.println(10);
    }  
    void meth4 ()
    {
        int a =10;
        System.out.println(89);
        System.out.println(85);
        System.out.println(44);
    }
    void meth5 ()
    {
        System.out.println(77);
        ClassF aobj=new ClassF();
        aobj.meth2();
        System.out.println(99);
    }
    public static void main(String[] args) 
    {
        System.out.println("Start");
        ClassF aobj=new ClassF();
        aobj.meth3();
        System.out.println("End");
    }
}
