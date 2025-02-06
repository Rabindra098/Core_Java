package pack5;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassAH {
    ArrayList<Student> meth1(ArrayList<String> al1, boolean arr[], ArrayList<Integer> al2) {
        System.out.println("---------Task1---------\n");

        // Fixing loop condition (i >= 0 instead of 1 >= 0)
        for (int i = al1.size() - 1; i >= 0; i--) {
            System.out.print(al1.get(i) + " ");  // Added space for better readability
        }
        System.out.println();

        System.out.println("\n----------Task2--------\n");
        for (boolean data : arr) {
            System.out.print(data + " ");  // Print on the same line
        }
        System.out.println();

        System.out.println("\n----------Task3--------\n");
        ArrayList<Integer> al3 = new ArrayList<>();
        for (int i = al2.size() - 1; i >= 0; i--) {
            al3.add(al2.get(i));
        }
        System.out.println("al3 : " + al3);
        
        System.out.println("----------Task------------");
        System.out.println("\nPassing user defined Class object into ArrayList\n");
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student("Rabi","Java",408));
		al.add(new Student("Raju","Oracle",520));
		al.add(new Student("Jatin","Python",450));
		al.add(new Student("Subham","Spring",480));
		
		System.out.println("al : "+al);
        System.out.println("\nRetriving the data by using Irerate loop\n");
		Iterator<Student> i=al.iterator();
		while (i.hasNext()) 
		{
			System.out.println(i.next());
		}
        return null;
    }

    public static void main(String[] args) {
        ClassAH aobj = new ClassAH();

        ArrayList<String> input1 = new ArrayList<>();
        input1.add("India");
        input1.add("Kannada");
        input1.add("England");

        boolean input2[] = { true, false, true };

        ArrayList<Integer> input3 = new ArrayList<>();
        input3.add(10);
        input3.add(20);
        input3.add(30);

        // Call meth1() to execute its logic
        aobj.meth1(input1, input2, input3);
    }
}
