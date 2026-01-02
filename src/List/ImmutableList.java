package List;

import java.util.List;

public class ImmutableList {

	public static void main(String[] args) {
		List<String> l=List.of("Raja","Mona","Lisa");
		System.out.println(l);
		l.add(0,"Hari");//run time exp -: java.lang.UnsupportedOperationException
	}

}
