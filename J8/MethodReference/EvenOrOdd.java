package MethodReference;

import java.util.Vector;

public class EvenOrOdd {
	public static void evenOrOdd(int num) {
		if(num%2==0)
			System.out.println(num+" is Even");
		else
			System.out.println(num+" is Odd");
	}
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(2);
		v.add(4);
		v.add(24);
		v.add(32);
		v.add(4);
		v.add(67);
		v.add(35);
		System.out.println("Lamda exp...");
		v.forEach(x->EvenOrOdd.evenOrOdd(x));
		System.out.println("Using method ref....");
		v.forEach(EvenOrOdd::evenOrOdd);
	}
}
