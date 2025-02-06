package pack1;

public class ClassT 
{
	int meth1(int a,int b,int c)    //main() a=10, b=20, c=x
    {
        System.out.println(c);
        int result=new ClassT().meth2("java",100,'y');
        return 10+a+result;
    }    
    int meth2(String s,int a,char c)
    {
        System.out.println(s);
        System.out.println(c);
        return 20;
    }
    public static void main(String[] args) 
    {
        System.out.println(new ClassT().meth1(10, 20, 'x'));
    }
}
