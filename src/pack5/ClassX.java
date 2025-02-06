package pack5;
//character streams
import java.io.FileReader;
import java.io.FileWriter;

public class ClassX 
{
	void fileOperation1()throws Exception
	{
		System.out.println("Reading the data into a file by Character Stream");
		FileReader fr = new FileReader("C:\\Users\\ADMIN\\OneDrive\\Desktop\\java\\Nit\\file3.txt");
		System.out.println("Connectio created\n");
		int i;
		while ((i=fr.read())!=-1) 
		{
			System.out.print((char)i);
		}
		System.out.println("\n\nData Retrived");
		fr.close();
	}
	void fileOperation2()throws Exception
	{
		System.out.println("\nWriting the data into a file by Character Stream");
		FileWriter fw = new FileWriter("C:\\Users\\ADMIN\\OneDrive\\Desktop\\java\\Nit\\file4.txt",true);
		System.out.println("Connection created");
		String msg="Java is a class-based, object-oriented programming language that is designed to have "
				+ "as few implementation dependencies as possible. It is intended to let application developers "
				+ "Write Once and Run Anywhere (WORA), meaning that compiled Java code can run on all platforms "
				+ "that support Java without the need for recompilation. Java was developed by James Gosling "
				+ "at Sun Microsystems Inc. in May 1995 and later acquired by Oracle Corporation and is "
				+ "widely used for developing applications for desktop, web, and mobile devices.";
		fw.write(msg);
		System.out.println("\nData Retrived\n");
		fw.close();
	}
	void fileOperation3() throws Exception
	{
		System.out.println("Copiing the data from a file by the character stream");
		FileReader fr = new FileReader("C:\\\\Users\\\\ADMIN\\\\OneDrive\\\\Desktop\\\\java\\\\Nit\\\\file4.txt");
		FileWriter fw = new FileWriter("C:\\\\Users\\\\ADMIN\\\\OneDrive\\\\Desktop\\\\java\\\\Nit\\\\file5.txt");
		System.out.println("Connection created");
		int i;
		while ((i=fr.read())!=-1) 
		{
			fw.write(i);
		}
		System.out.println("Data copied");
		fr.close();
		fw.close();
	}
	public static void main(String[] args) throws Exception
	{
		ClassX aobj = new ClassX();
		aobj.fileOperation1();
		aobj.fileOperation2();
		aobj.fileOperation3();
	}
}
