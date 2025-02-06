package pack1;

public class ClassS 
{
	void meth1()
    {
        System.out.println(10);
        System.out.println(64);
        System.out.println("end");
    }    
    int meth2(int a, int b,int c)
    {
        System.out.println(a);
        ClassS bobj=new ClassS();
        String s =bobj.meth5(100,"javais awesome!!");
        System.out.println(s);
        return a-b;
    }
    String meth3(String s, int b,int d)
    {
        System.out.println(b+d);
        return s;
    }
    int meth4(int c,int k)
    {
        System.out.println(k);
        ClassS bobj=new ClassS();
        int result = bobj.meth2(50, 50, 50);
        System.out.println((result));
        return k+10;
    }
    String meth5(int a,String l)
    {
        ClassS bobj=new ClassS();
        String s =bobj.meth3("hi", 15, 10);
        System.out.println(s);
        return l;
    }
    public static void main(String[] args) 
    {
        ClassS bobj=new ClassS();
        System.out.println("Start");
        int result = bobj.meth4(20, 10);
        System.out.println(result);
        bobj.meth1();
    }
}
