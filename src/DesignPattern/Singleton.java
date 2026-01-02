package DesignPattern;
/*
 * What is the Singleton Pattern?
 * ->Singleton ensures only one instance of a class exists and provides a global point of access.
 */

public class Singleton {
	private static Singleton instance;

	private Singleton() {
		System.out.println("Singleton.Singleton()");
	}

	public static synchronized Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();
		return instance;
	}

	public class Test {
		public static void main(String[] args) {
			Singleton obj1 = Singleton.getInstance();
			Singleton obj2 = Singleton.getInstance();
			System.out.println(obj1 == obj2); // true
		}
	}
}
