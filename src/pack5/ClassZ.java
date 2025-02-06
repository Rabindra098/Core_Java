package pack5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class ClassZ 
{
	void fileoperation1() throws Exception
	{
		System.out.println("Reading the data into a  file by buffer character streams");
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ADMIN\\OneDrive\\Desktop\\java\\Nit\\file7.txt"));
		System.out.println("Connection created\n");
		int i;
		while((i=br.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println("\n\nData retrived");
		br.close();
	}
	void fileoperation2() throws Exception
	{
		System.out.println("Writing the data into a file by buffer character streams");
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\ADMIN\\OneDrive\\Desktop\\java\\Nit\\file8.txt"));
		System.out.println("Connection created\n");
		String msg="I love java, beacuse it is awesome";
		bw.write(msg);
		System.out.println("\n\nData retrived");
		bw.close();
	}
	void fileOperation3() throws Exception
	{
		System.out.println("\nCopiing the data from a file by buffer character streams");
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ADMIN\\OneDrive\\Desktop\\java\\Nit\\file8.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\\\Users\\\\ADMIN\\\\OneDrive\\\\Desktop\\\\java\\\\Nit\\\\file9.txt",true));
		System.out.println("Connection created\n");
		int i;
		while((i=br.read())!=-1)
		{
			bw.write(i);
		}
		System.out.println("Data copied");
		br.close();
		bw.close();
	}
	public static void main(String[] args) throws Exception
	{
		ClassZ aobj = new ClassZ();
		aobj.fileoperation1();
		aobj.fileoperation2();
		aobj.fileOperation3();
	}
}
