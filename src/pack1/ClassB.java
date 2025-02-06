package pack1;

public class ClassB 
{
	void meth1(){
        System.out.println("Hyy");
        System.out.println("100");
        System.out.println(100);
        System.out.println(10+100);
        System.out.println(1000/2);
    }
    void meth2(){
        System.out.println("hellow");
        ClassB obj = new ClassB();
        obj.meth1();
        System.out.println(2*5);
        System.out.println(80+30);
    }
    public static void main(String[] args) {
        System.out.println("Start");
        System.out.println("Java is Awesome !!!");
        ClassB obj = new ClassB();
        obj.meth2();
        System.out.println("End");
    }
}
