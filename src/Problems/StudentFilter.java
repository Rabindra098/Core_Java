package Problems;

import java.util.ArrayList;

public class StudentFilter {
	void meth1()
	{
		System.out.println("Implementing ArrayList");
		ArrayList<Student_Class> al = new ArrayList<Student_Class>();
		al.add(new Student_Class("Alice", "Java"));
		al.add(new Student_Class("Bob", "Python"));
		al.add(new Student_Class("charlie", "Java"));
		al.add(new Student_Class("David", "C++"));
		al.add(new Student_Class("Eve", "Java Script"));
		//Test=1
		System.out.println("\nTest case 1 : ");
		System.out.println("Retriving the data by using for-each loop");
		for (Student_Class o : al) 
		{
			System.out.println(o);
		}
		System.out.println("\nTest case 2 : \n"+al.get(0)+"\n"+al.get(2));
		
	}
	public static void main(String[] args) 
	{
		new StudentFilter().meth1();
	}
}
