package pack1;

public class ClassX 
{
	int meth1(int a,int b) //meth2() a=200, b=199
    {
        System.out.println(a);  //print a value
        System.out.println(a-b); // print a-b value
        return new ClassX().meth4(a-1, "hi"); 
    }    
    String meth2(int x)    // main() x=500
    {
        System.out.println(x-new ClassX().meth1(200, 199)); //x-(??)/x-creating and calling meth1()/x-398/500-398=102
        System.out.println(x);
        return "java";
    }
    String meth3(int a, int b,String s)
    {
        System.out.println(a);
        System.out.println(a+a);
        System.out.println(a+b);
        return s;
    }
    int meth4(int a, String s)
    {
        System.out.println(a);  //meth1() a=199 s=hi
        System.out.println(s); //print s=hi
        return a+a; //return a+a=199+199=398
    }
    String meth5(String s)
    {
        return s;
    }
    public static void main(String[] args) 
    {
        System.out.println(new ClassX().meth5(new ClassX().meth3(15, 25, new ClassX().meth2(500))));  
        /* 1st creating and calling meth2() */     
    } 
}
