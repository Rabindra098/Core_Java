package pack2;

import java.util.Scanner;

public class ClassBO 
{
	Scanner sc=new Scanner(System.in);
	void meth1()
	{
		System.out.println("Which movie You want to see ?");
		String movie_name=sc.nextLine();
		System.out.println(movie_name+" is a very nice choise!!");
		System.out.println("How many tickets you need for "+movie_name+" ?");
		String names []=new String[Integer.parseInt(sc.nextLine())];
		System.out.println("Plese enter "+names.length+" names for ticket booking");
		for (int i = 0; i < names.length; i++) 
		{
			names[i]=sc.next();
		}
		System.out.println("Please choose your row between A to Z");
		String row =sc.next();
		System.out.println("Please enter your Starting seat number");
		int seat_no=sc.nextInt();
		System.out.println("\nYour tickets were booked for "+movie_name+" ,below are the details");
		for (String data : names) 
		{
			System.out.println(data+"-"+row+" "+seat_no++);
		}
	}
	public static void main(String[] args) 
	{
		new ClassBO().meth1();
	}
}
