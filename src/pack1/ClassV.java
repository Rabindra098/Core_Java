package pack1;

public class ClassV 
{
	String meth1(int a,int b)
    {
        System.out.println(10);
        System.out.println((54+a)-b);
        int value = new ClassV().meth5();
        System.out.println(value);
        return "java";
    }    
    int meth2(int a)
    {
        System.out.println(75);
        int b =5;
        System.out.println(b-a);
        return(5*5)-b;
    }
    void meth3()
    {
        System.out.println("Start");
        System.out.println(new ClassV().meth4());
        System.out.println(40);
    }
    String meth4()
    {
        System.out.println("Today is Tuesday");
        return new ClassV().meth1(4, 8);
    }
    int meth5()
    {
        ClassV obj=new ClassV();
        System.out.println(99);
        return obj.meth2(5);
    }
    public static void main(String[] args) 
    {
        ClassV obj=new ClassV();
        obj.meth3();    
    }
}
