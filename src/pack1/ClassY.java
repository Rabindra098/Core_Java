package pack1;

public class ClassY 
{
	public String testmeth1()                               // main() 
    {
        System.out.println(35);                            //print 35
        return new ClassY().testmeth3 (new ClassY().testmeth2())+ new ClassY().testmeth4("here"); //return testmeth(is awesome)
    }    
    public int testmeth2()
    {
        System.out.println(25);                           //print 25
        return 25+5;                                        //return testmethod2(30)
    }
    public String testmeth3(int a)
    {
        System.out.println(15);                           //print 15
        return "is  ";                                      //return testmethod3("is")
    }
    public String testmeth4(String s)
    {
        System.out.println(45);
        return "awesome";
    }
    public static void main(String[] args) 
    {
        ClassY aobj=new ClassY();                           //creating an object
        System.out.println("java  "+ aobj.testmeth1());     //calling the method
    }
}
