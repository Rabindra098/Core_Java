package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Orrange");
		list.add("Mango");
		Stream<String> stream = list.stream();
		stream.forEach(p->System.out.println(p));
		//or
		list.stream().forEach(p->System.out.println(p));
	}
}
