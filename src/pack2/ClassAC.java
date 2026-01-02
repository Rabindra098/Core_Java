package pack2;

public class ClassAC {
	void implicit() {
		byte b = 10;
		System.out.println("byte value b :" + b); // 10
		short s = b; // 10
		System.out.println("short value s :" + s); // 10
		s++; // 10 s=11
		int i = s++; // i=11 s=12
		System.out.println("int value i :" + i); // 11
		System.out.println("short value s :" + s); // 12
		long l = i; // 11
		System.out.println("long value l :" + (--l)); // 10
		float f = l;// 10.0
		System.out.println("float value f :" + (f + b)); // 10.0+10=20.0
		double d = --f;// d=9 f=9.0
		System.out.println("double value d :" + d);// 9.0
		show();
		if (!(d == f)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");// not equal
		}
	}

	public static void main(String[] args) {
		ClassAC a = new ClassAC();
		a.implicit();
	}

	static void show() {
		char c = 'A'; // c=65
		int a = ++c; // a=66
		System.out.println(a); // 66
		ClassAC obj = new ClassAC();
		String s = obj.meth1();
		System.out.println(s);// Implicit typecasting done by the compiler automatically
	}

	String meth1() {
		String s = "Implicit typecasting done by the compiler automatically ";
		return s;
	}
}
