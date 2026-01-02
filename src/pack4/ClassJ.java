package pack4;

public class ClassJ {
	void meth1() {
		System.out.println("ClassJ meth1() called");
	}

	protected int meth2(int i) {
		System.out.println("ClassJ meth2() called");
		return 100;
	}

	void meth3(int i, String s) {
		System.out.println("ClassJ meth3() called");
	}

	static void meth4() {
		System.out.println("ClassJ meth4() called");
	}

	ClassJ meth5() {
		System.out.println("ClassJ meth5() called");
		return new ClassJ();
	}
}
