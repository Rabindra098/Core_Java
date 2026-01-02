package Collection;

import java.util.Arrays;

public class NITCollection {

	private Object[] objArray = new Object[10];
	private int elementCount = 0;

	public void add(Object obj) {
		if (elementCount == objArray.length) {
			increaseCapacity();
		}
		objArray[elementCount] = obj;
		elementCount++;
	}

	private void increaseCapacity() {
		int newCapacity = objArray.length * 2;
		Object[] newArray = new Object[newCapacity];
		for (int i = 0; i < objArray.length; i++) {
			newArray[i] = objArray[i];
		}
		objArray = newArray;
	}

	public int capacity() {
		return objArray.length;
	}

	public int size() {
		return elementCount;
	}

	public Object get(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("Error");
		}
		return objArray[index];
	}

	public void replace(int index, Object obj) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("Error");
		}
		objArray[index] = obj;
	}

	public void remove(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("Error");
		}
		while (index < size() - 1) {
			objArray[index] = objArray[index + 1];
			index++;
		}
		objArray[index] = null;
		elementCount--;
	}

	public void insert(int index,Object obj) {
		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException("Error");
		}
		if(size()==capacity()) {
			increaseCapacity();
		}
		for (int i = size()-1; i >= index; i--) {
			objArray[i+1]=objArray[i];
		}
		objArray[index]=obj;
	}
	@Override
	public String toString() {
		return "NITCollection : "+ Arrays.toString(objArray);
	}

	public static void main(String[] args) {
		NITCollection cd = new NITCollection();
		//adding the object
		cd.add("A");
		cd.add("b");
		cd.add("A");
		cd.add(9);
		cd.add('T');
		cd.add(null);
		cd.add("Hello");
		cd.add(63.0);
		cd.add("j");
		cd.add('O');
		cd.add(81l);
		cd.add(91.9f);
		//Size of the Array
		System.out.println("Size :" + cd.size());
		//Size of the capacity
		System.out.println("Capacity :" + cd.capacity());
		//Retrieving the All Objects
		System.out.println(cd);
		//Retrieving Particular object
		Object obj = cd.get(6);
		System.out.println(obj);
		//replace one object
		cd.replace(6, "Puja");
		System.out.println(cd);
		//remove object
		cd.remove(6);
		System.out.println(cd);
		//insert object inside the array
		cd.insert(1,"Hello");
		System.out.println(cd);
		System.out.println("Capacity :" + cd.capacity());
		System.out.println("Size :" + cd.size());
	}

}
