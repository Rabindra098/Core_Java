package List;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorInterface {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			al.add(i);
		}
		Spliterator<Integer> splItr = al.spliterator();
		System.out.println("By default forEachRemaining : ");
		splItr.forEachRemaining(num -> System.out.print(num + " "));
		System.out.println();
		System.out.println("BY USING FOR EACH METHOD :");
		al.forEach(num1 -> System.out.print(num1 + " "));
		System.out.println();
		System.out.println("BY USING METHOD REFERENEC :");
		al.forEach(System.out::print);

	}

}
