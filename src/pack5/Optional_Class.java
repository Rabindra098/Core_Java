package pack5;

import java.util.Optional;

public class Optional_Class 
{
	void meth1()
	{
		String arr[]= new String[5];
		arr[1]="Java";
		arr[2]="Rabindra";
		arr[0]="Komal";
//		System.out.println(arr[3].toUpperCase()); //Geting NullPointerException
		Optional<String> o=Optional.ofNullable(arr[3]);
		System.out.println(o);
		if (o.isPresent()) 
		{
			System.out.println("Data is present");
			System.out.println(o.get());
		}
		else 
		{
			System.out.println("Is empty");
		}
		System.out.println("Retrive the data from Array\n");
		for (int i = 0; i <= arr.length-1; i++) 
		{
			Optional<String> o2=Optional.ofNullable(arr[i]);
			if (o2.isPresent()) 
			{
				System.out.println(o2.get().toUpperCase());
			}
			else 
			{
				System.out.println("------------");
			}
		}
	}
	public static void main(String[] args) 
	{
		new Optional_Class().meth1();
	}
}
