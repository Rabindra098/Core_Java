package pack1;

public class ClassH 
{
	void mes()
    {
        System.out.println("Java is awesome");
    } 
    void display()
    {
        System.out.println("java is amazing");
    }   
    public static void main(String[] args) 
    {
        ClassH aobj=new ClassH();
        aobj.mes();
        aobj.display();
        System.out.println("--------");
        new ClassH().mes();
        new ClassH().display();    
    }
}
