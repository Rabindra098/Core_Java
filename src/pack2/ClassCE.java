package pack2;

import java.util.Arrays;
import java.util.Scanner;

public class ClassCE 
{
	void meth1()
	{
		System.out.println("meth1() called\n");
		String s1="Java";
		String s2=new String("Java");
		String s3="Java";
		String s4=new String("Java");
		
		//-------------equal()----------------
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s4));
		System.out.println("====>"+s1.equalsIgnoreCase("Java"));
		System.out.println("Java".equals(s3));
		System.out.println("Java".equals(new String("Java")));
		System.out.println("---------------------");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		System.out.println(s2==s3);
		System.out.println(s1=="Java");
		System.out.println("Java"==new String("Java"));
		System.out.println(new String("Java")==s2);
		System.out.println(new String("Java")==new String("Java"));
		System.out.println("java"=="Java");
	}
	void meth2()
	{
		System.out.println("meth2() called\n");
		String s1="Java";
		System.out.println("length() :"+s1.length());	//4
		System.out.println("s1 :"+s1);	//java
		System.out.println("==>"+s1.concat(" is awesome!!"));	//Java is awesome
		System.out.println("s1 :"+s1);	//java
		System.out.println("==>"+s1.concat(" is awesome!!").length());	//==> 17
		
		System.out.println("charAt() :"+s1.charAt(0));	//charAt() :J
		System.out.println("charAt() :"+s1.charAt(s1.length()-3));//charAt() :v
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Gender 1st leter : ");	
		char gender = sc.next().charAt(0);	
		switch (gender) 
		{
		case 'F','f': 	
			System.out.println("User is Female");
			break;
		case 'M','m':
			System.out.println("User is Male");
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
		sc.close();
		System.out.println("startsWith() :"+s1.startsWith("J"));	//true
		System.out.println("toLowerCase() :"+s1.toLowerCase());	//java
		System.out.println("toUpperCase() :"+s1.toUpperCase());	//JAVA
		System.out.println("s1 :"+s1);	//Java
		
		String s2="Java is awesome!!";	
		System.out.println("subString :"+s2.substring(0));	//Java is awesome!! 
		System.out.println("subString :"+s2.substring(9,11));	//9=index_position  || 11=Length_position	===>we            
		System.out.println("subString :"+s2.substring(3,9));	//a is a
		
		String s3="Hyy Rabindra";
		System.out.println("replace() :"+s3.replace('b', 'v'));
		System.out.println(s3.length());
		System.out.println("trim() :"+s3.trim().length());
		System.out.println("indexOf() :"+s3.indexOf('a'));
		System.out.println("lastIndexOf() :"+s3.lastIndexOf('a'));
		
		String date="18-dec-2024";
		String arr1[]=date.split("-");
		System.out.println("arr1 : "+Arrays.toString(arr1));
		
		String msg="I Love Java";
		String arr2[]=msg.split(" ");
		System.out.println("arr2 : "+Arrays.toString(arr2));
		
		String data="ABCDEFGH";
		byte arr3[]=data.getBytes();
		for (byte b:arr3)
		{
			System.out.print((char)b+" ");
		}
	}
	public static void main(String[] args) 
	{
		ClassCE aobj = new ClassCE();
		aobj.meth1();
		System.out.println("**********************************");
		aobj.meth2();
	}
}
