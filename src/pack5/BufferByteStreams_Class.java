package pack5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferByteStreams_Class 
{
	void fileOperation1()throws Exception
	{
		System.out.println("Reading the data into a  file by buffer byte streams");
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\ADMIN\\OneDrive\\Desktop\\java\\Nit\\file5.txt"));
		System.out.println("Connection created\n");
		int i;
		while((i=bis.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println("\n\nData retrived");
		bis.close();
	}
	void fileOperation2() throws Exception
	{
		System.out.println("\nWriting the data into a file by buffer byte streams");
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("C:\\\\Users\\\\ADMIN\\\\OneDrive\\\\Desktop\\\\java\\\\Nit\\\\file7.txt",true));
		System.out.println("Connection created");
		String msg="Java is a class-based, object-oriented programming language that is designed to have as few implementation "
				+ "dependencies as possible. It is intended to let application developers Write Once and Run Anywhere (WORA), "
				+ "meaning that compiled Java code can run on all platforms that support Java without the need for recompilation.";
		bos.write(msg.getBytes());
		System.out.println("Data written");
		bos.close();
		
	}
	void fileOperation3() throws Exception
	{
		System.out.println("\nCopiing the data from a file by buffer byte streams");
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\ADMIN\\OneDrive\\Desktop\\java\\Nit\\file5.txt"));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("C:\\\\Users\\\\ADMIN\\\\OneDrive\\\\Desktop\\\\java\\\\Nit\\\\file6.txt",true));
		System.out.println("Connection created\n");
		int i;
		while((i=bis.read())!=-1)
		{
			bos.write(i);
		}
		System.out.println("Data copied");
		bis.close();
		bos.close();
	}
	public static void main(String[] args) throws Exception
	{
		BufferByteStreams_Class aobj = new BufferByteStreams_Class();
		aobj.fileOperation1();
		aobj.fileOperation2();
		aobj.fileOperation3();
	}
}
