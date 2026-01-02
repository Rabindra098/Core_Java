package pack4;

public class ClassS extends ClassR {
	@Override
	void meth1() {
		System.out.println("ClassC");
	}

	public static void main(String[] args) {
		ClassQ aobj = new ClassR();
		aobj.meth1();

		ClassQ aobj1 = new ClassS();
		aobj1.meth1();
	}
}
