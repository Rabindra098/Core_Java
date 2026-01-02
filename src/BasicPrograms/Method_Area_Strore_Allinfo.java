package BasicPrograms;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

class TestClass
{
    int x=100;
    static Scanner sc=new Scanner(System.in);
    static int y=200;
    int z=300;
    public void input() {}

    public static void acept() {}
    
    public void display() {}

    public void show() {}

    public void m1() {}
}

public class Method_Area_Strore_Allinfo 
{
    public static void main(String[] args) throws ClassNotFoundException 
    {
       Class cls=Class.forName("OOPS.TestClass");
       System.out.println("class name="+cls.getName());
       System.out.println("Packagte name="+cls.getPackageName());
       
       Method[] methods =cls.getDeclaredMethods();
       System.out.println("Methods name are=");
       int count=0;
       for(Method method:methods)
       {
           System.out.println(method.getName());
           count++;
       }
       System.out.println("Total methods are="+count);
       
       count=0;
       Field[] fields=cls.getDeclaredFields();
       
       System.out.println("Available fields are=");
       for(Field field:fields)
       {
           System.out.println(field.getName());
           count++;
       }
       System.out.println("Total number of fields are="+count);
       
    }
}