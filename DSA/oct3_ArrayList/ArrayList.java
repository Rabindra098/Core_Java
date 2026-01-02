
package oct3_ArrayList;

public class ArrayList<E> {

	private Object[] a = new Object[5];
	private int p = 0;

	public void add(E e) {
		if (p >= a.length)
			increaseSize();

		a[p++] = e;
	}

	private void increaseSize() {
		Object[] temp = new Object[a.length + 5];

		for (int i = 0; i < a.length; i++) {
			temp[i] = a[i];
		}
		a = temp;
	}

	public int size() {
		return p;
	}

	public void insert(int index, E e) {
		if (p >= a.length)
			increaseSize();
		for (int i = size() - 1; i >= index; i--) {
			a[i + 1] = a[i];
		}
		a[index] = e;
		p++;
	}

	public E get(int index) {
		if (index < 0 || index >= p) {
			throw new IndexOutOfBoundsException();
		}
		return (E) a[index];
	}

	public void remove(int index) {
		if (index < 0 || index > p) {
			throw new IndexOutOfBoundsException();
		}
		for (int i = index + 1; i < size(); i++) {
			a[i - 1] = a[i];
		}
		a[--p] = null;
	}

	public String toString() {
		if (size() == 0)
			return "[]";
		String s1 = "[" + a[0];
		for (int i = 1; i < size(); i++) {
			s1 = s1 + "," + a[i];
		}
		s1 = s1 + "]";
		return s1;
	}
}
