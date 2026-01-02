package Collection;

import java.util.ArrayList;

public class Factory {
	ArrayList<Object> order(int item) {
		ArrayList<Object> list = new ArrayList<Object>();
		for (int i = 0; i < item; i++) {
			Bike b1 = new Bike("MT15");
			list.add(b1);
		}
		return list;
	}
}
