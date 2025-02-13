package pack5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStraems_Class 
{
	void fileOperation1() throws Exception
	{
		System.out.println("Writing the data into a file by DataOutputStream ");
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\ADMIN\\OneDrive\\Desktop\\java\\Nit\\file10.txt"));
		System.out.println("connection created");
		dos.writeInt(1000);
		dos.writeChar('A');
		dos.writeBoolean(true);
		dos.writeInt(2000);
		System.out.println("\nData Entered securly");
		
		System.out.println("\nReading the data into a file by DataInputStream");
		DataInputStream dis = new DataInputStream(new FileInputStream("C:\\\\Users\\\\ADMIN\\\\OneDrive\\\\Desktop\\\\java\\\\Nit\\\\file10.txt"));
		System.out.println("Connection Created\n");
		System.out.println(dis.readInt());
		//System.out.println(dis.readInt());	//Please maintain the order 
		System.out.println(dis.readChar());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readInt());
		//System.out.println(dis.readInt());//Exception
		try 
		{
			System.out.println(dis.readInt());
		} 
		catch (EOFException e)
		{
			e.printStackTrace();
		}
		finally 
		{
			System.out.println("\nData retrived securly");
		}
		dos.close();
		dis.close();
	}
	public static void main(String[] args) throws Exception
	{
		DataStraems_Class aobj = new DataStraems_Class();
		aobj.fileOperation1();
	}
}
