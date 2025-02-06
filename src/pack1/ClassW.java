package pack1;

public class ClassW 
{
	int meth1()
    {
        System.out.println("meth1() calling");
        return 10;
    }    
    int meth2()
    {
        System.out.println("meth2() calling");
        return new ClassW().meth1()+99; //we can pass that value as a returing value for another method.
    }
    void meth3(int num)
    {
        System.out.println("meth3() calling");
        System.out.println("num value :"+num);
    }
    public static void main(String[] args) 
    {
        
        ClassW aobj=new ClassW();
        int i1=aobj.meth1(); //we can store that value in a variable.
        System.out.println(new ClassW().meth1()); //we can directly print that value in syso
         
        System.out.println(new ClassW().meth1()+90);
        System.out.println(new ClassW().meth2());
        new ClassW().meth3(new ClassW().meth1());   
    }
}
