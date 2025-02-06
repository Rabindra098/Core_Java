package pack1;

public class ClassL 
{
	void display(String s, int i, char c)
    {
        System.out.println("s");
        System.out.println(s);
        System.out.println('s');
        System.out.println("i");
        System.out.println(i);
        System.out.println('c');
        System.out.println(c);
        System.out.println(i+99);
        System.out.println("i+99");
    }
    public static void main(String[] args) 
    {
        System.out.println("Start");
        new ClassL().display("java is awesome!!", 99, 'z'); 
        System.out.println("End");   
    }    
}
