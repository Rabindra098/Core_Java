package pack1;

public class ClassG 
{

    void meth1()
    {
        System.out.println("hello");
    }
    public static void main(String[] args) 
    {
        System.out.println("java is awesome");
        ClassG aobj=new ClassG();
        aobj.meth1();
        System.out.println("----------");
        new ClassG().meth1();
    }
}
