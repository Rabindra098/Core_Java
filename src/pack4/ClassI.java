package pack4;
//Polymorphism

public class ClassI {
	private static void meth1() {
		System.out.println(10);
	}

	static int meth1(int i) {
		System.out.println(20);
		return i;
	}

	public void meth1(String s) {
		System.out.println(30);
	}

	void meth1(int i, String s) {
		System.out.println(40);
	}

	static protected String meth1(String s, int i) {
		System.out.println(50);
		return s;
	}

	StringBuffer meth1(StringBuffer sb) {
		System.out.println(60);
		return sb;
	}

	private void meth1(byte b) {
		System.out.println(70);
	}

	public static void main(String[] args) {
		ClassI aobj = new ClassI();
		aobj.meth1();
		aobj.meth1(100);
		aobj.meth1("Rabi");
		aobj.meth1(100, "Rabi");
		aobj.meth1("Rabi", 100);
		aobj.meth1(new StringBuffer("java"));
		aobj.meth1((byte) 100);
		main();
		main("java is awesome");
	}

	public static void main() {
		System.out.println("1st main()");
	}

	public static void main(String s) {
		System.out.println("2nd main()");
	}

	ClassI() {
		this("Rabi");
		System.out.println("Default constructor");
	}

	ClassI(String s) {
		System.out.println("Parameterized constructor" + s);
	}

//	static()
//	{
//		System.out.println(10);
//	}
	final static void meth1(int y, char c) {
		// return y;
	}
}
