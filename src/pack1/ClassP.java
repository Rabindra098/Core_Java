package pack1;

public class ClassP 
{

    int meth1(String s)
    {
        System.out.println("hii");
        System.out.println(s);
        return 5;
    }    
    public static void main(String[] args) 
    {
        System.out.println("Start");
        System.out.println((new ClassP().meth1("java")));
        System.out.println("End");
    }
}
