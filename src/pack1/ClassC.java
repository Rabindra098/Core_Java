package pack1;

public class ClassC 
{
	void meth1 () //main()
    {
        System.out.println("Hyy");
        int x = 10; //variable
        int y = 90;
        System.out.println("x :"+x);
        System.out.println("y :"+y);
        System.out.println("addition :"+(x+y));
    }
    public static void main(String[] args) 
    {
        ClassC aobj=new ClassC();
        System.out.println("Start");
        System.out.println("Java is awesome");
        aobj.meth1();
        System.out.println("End");
    }
}
