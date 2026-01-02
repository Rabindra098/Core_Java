package pack4;

@FunctionalInterface
public interface Inter {
	public abstract String meth1();

	default void meth2() {
		System.out.println("Java Is Awesome");
	}

	static void meth3() {
		System.out.println("Keep Smilling");
	}

	private String meth4() {
		System.out.println("38476");
		return "java";
	}

	public static void main(String[] args) {
		System.out.println("Hello");
		
	}

}
