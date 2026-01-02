package Collection;

import java.util.ArrayList;

public class showRoom extends Factory {
	public static void main(String[] args) {
		showRoom bajaj = new showRoom();
		ArrayList<Object> obj = bajaj.order(5);
		for (Object bike : obj) {
			System.out.println(bike);
		}
//		obj.forEach(System.out::println);
	}
}
