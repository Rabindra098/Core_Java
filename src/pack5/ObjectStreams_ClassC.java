package pack5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreams_ClassC 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Performing serilization\n");
		ObjectStreams_ClassA aobj1 = new ObjectStreams_ClassA();
		System.out.println("aobj1.a : "+aobj1.a+"   "+"aobj1.b : "+aobj1.b);
		
		ObjectStreams_ClassB bobj1 = new ObjectStreams_ClassB();
		System.out.println("bobj1.x : "+bobj1.x+"   "+"bobj1.y : "+bobj1.y);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\ADMIN\\OneDrive\\Desktop\\java\\Nit\\file11.txt"));
		System.out.println("\nConnection Created");
		oos.writeObject(aobj1);
		oos.writeObject(bobj1);
		System.out.println("Serilization completed");
		oos.close();
		
		System.out.println("\nPerforming De-serilization");
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\\\Users\\\\ADMIN\\\\OneDrive\\\\Desktop\\\\java\\\\Nit\\\\file11.txt"));
		System.out.println("Connection Created\n");
		
		ObjectStreams_ClassA aobj2=(ObjectStreams_ClassA)ois.readObject();
		System.out.println("aobj2.a : "+aobj2.a+"   "+"aobj2.b : "+aobj2.b);
		
		ObjectStreams_ClassB bobj2=(ObjectStreams_ClassB)ois.readObject();
		System.out.println("bobj2.x : "+bobj2.x+"   "+"bobj2.y : "+bobj2.y);
		System.out.println("\nDe-Serilization completed");
		ois.close();
	}
}
