package pack4;

public abstract class ClassL {
	abstract void meth1();

	String msg(int i) {
		System.out.println("ClassL meg() called");
		return "Java";
	}

	void meth2() {
		System.out.println("ClassL meth2() Called");
	}

	static void meth3() {
		System.out.println("ClassL meth3() called");
	}

	ClassL() {
		System.out.println("Default constructor Called");
	}

	static {
		System.out.println("ClassL static block called");
	}

	public static void main(String[] args) {
		// ClassL aobj = new ClassL(); //C.E (because )

	}
}
