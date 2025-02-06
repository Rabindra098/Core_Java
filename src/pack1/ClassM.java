package pack1;

public class ClassM 
{
	void meth1( int a, String s) //meth4() a=10, s=hello
    {
        System.out.println(a);
        System.out.println("a");
        System.out.println('a');
        System.out.println(a);
        System.out.println("s:"+s);
    }
    void meth2 ( int a, int b) //main() a=5,b=10
    {
        System.out.println(a*a);
        System.out.println(b);
        new ClassM().meth4("java is awesome");
        new ClassM().meth3('A', 100);
        System.out.println(a-b);
    }
    void meth3(char c, int a)
    {
        System.out.println(c);
        System.out.println('c');
        System.out.println(a);
    }
    void meth4(String s) //meth4() s= java is awesome
    {
        new ClassM().meth1(10,"hello");
        System.out.println(s);
    }
    public static void main(String[] args) 
    {
        System.out.println("Start");
        new ClassM().meth2(5,10);
        System.out.println("End");
    }
}
