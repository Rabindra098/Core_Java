package pack1;

public class ClassQ 
{
	String meth1(int x, String s)
    {
        System.out.println("Hii");
        System.out.println(x/2);
        return s + "is awesome";
    }    
    public static void main(String[] args) 
    {
        ClassQ aobj=new ClassQ();
        aobj.meth1(50, "java");
        System.out.println(aobj.meth1(50, "java"));
        String result=aobj.meth1(50, "java");
        System.out.println("result "+result);    
    }
}
