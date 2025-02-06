package pack1;

public class ClassA 
{
	public void meth1()
    {
        System.out.println("meth1 () called"); 
        System.out.println("hi");
        System.out.println(100);
    }
    public void meth2(){
        System.out.println("meth2 () calling");
        System.out.println("Hellow");
        System.out.println("200");
    }
    public static void main(String[] args) {
        System.out.println("Start");
        System.out.println("java is awesome!!!");
        ClassA obj =new ClassA(); //creat an object
        obj.meth1(); //calling method 1
        obj.meth2(); //calling method 2
        System.out.println("End");
    }
}
/*	out put
 	
 	Start
 	java is awesome!!!
 	merh1() called
 	hi
 	100
 	meth2() called
 	hello
 	200
 	End
 
*/