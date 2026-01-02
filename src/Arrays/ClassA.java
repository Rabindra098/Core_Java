package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ClassA 
{
	void meth1() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Method 1 Called");
		System.out.print("How many Names u want to enter : ");
		String name[]=new String[(sc.nextInt())];
		System.out.println("Please Enter "+name.length +" No. of Names :");
		for (int i = 0; i <= name.length-1; i++) {
			name[i]=sc.next();
		}
		System.out.println(Arrays.toString(name));
		System.out.println("for ward direction");
		for (int i = 0; i <= name.length-1; i++) {
			System.out.print(name[i]+" ");
		}
		System.out.println();
		System.out.println("backword direction");
		for (int i = name.length-1; i>=0; i--) {
			System.out.print(name[i]+" ");
		}
		System.out.println();
		for (String data : name) {
			System.out.println(data+" ");
		}
	}
	public static void main(String[] args) {
		new ClassA().meth1();
	}
}
