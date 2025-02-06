package pack1;

public class ClassR 
{
	int meth1(int num)
    {
        System.out.println("Hii");
        return 1+num;
    }    
    public static void main(String[] args) 
    {
        System.out.println(new ClassR().meth1(99)/2);    
    }
}
