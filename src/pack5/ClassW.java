package pack5;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ClassW 
{
	void fileOperation1() throws Exception
	{
		System.out.println("FileOperatin1 called");
		System.out.println("Reading the data from a file");
		FileInputStream fis = new FileInputStream("C:\\Users\\ADMIN\\OneDrive\\Desktop\\java\\Nit\\file1.txt");
		System.out.println("connection Created\n");
		int i;
		while ((i=fis.read())!=-1) 
		{
			System.out.print((char)i);
		}
		System.out.println("\n\ndata Readed");
		fis.close();
	}
	void fileOperation2() throws Exception
	{
		System.out.println("\nFileOperatin2 called");
		System.out.println("Writing the data into a file");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\ADMIN\\OneDrive\\Desktop\\java\\Nit\\file2.txt",true);	//append mood
		System.out.println("connection Created\n");
		String s="Java is awesome!!!,";
		byte arr[]=s.getBytes();
		fos.write(arr);
		System.out.println("data Entered");
		fos.close();
	}
	void fileOperation3() throws Exception
	{
		System.out.println("\nFileOperatin3 called");
		System.out.println("Copyed the data");
		FileInputStream fis=new FileInputStream("C:\\\\Users\\\\ADMIN\\\\OneDrive\\\\Desktop\\\\java\\\\Nit\\\\file2.txt");
		FileOutputStream fos= new FileOutputStream("C:\\\\Users\\\\ADMIN\\\\OneDrive\\\\Desktop\\\\java\\\\Nit\\\\file3.txt",true);
		System.out.println("Connection Created");
		int i;
		while ((i=fis.read())!=-1) 
		{
			fos.write(i);
		}
		System.out.println("Data copied");
		fis.close();
		fos.close();
	}
	public static void main(String[] args) throws Exception
	{
		ClassW aobj = new ClassW();
		aobj.fileOperation1();
		aobj.fileOperation2();
		aobj.fileOperation3();
	}
}
