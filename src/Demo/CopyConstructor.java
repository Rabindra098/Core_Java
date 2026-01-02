package Demo;

public class CopyConstructor {

	private String name;
	private int age;

	// Normal constructor
	public CopyConstructor(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	// Copy constructor
	public CopyConstructor(CopyConstructor s) {
	        this.name = s.name;
	        this.age = s.age;
	    }

	public void display() {
		System.out.println("Name: " + name + ", Age: " + age);
	}

	public static void main(String[] args) {
		CopyConstructor s1 = new CopyConstructor("Rabindra", 25);
		CopyConstructor s2 = new CopyConstructor(s1); // Using copy constructor

		s2.display();
	}

}
