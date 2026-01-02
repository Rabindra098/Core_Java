package Java8;

public interface Demo {
	
	// Constants (public static final)
	int AGE = 25;
	String COMPANY = "TechCorp";
	
	// Abstract method
	String hello();
	
	// Default method
	default void display() {
		System.out.println("Default method inside interface");
	}
	
	// Static method
	static void show() {
		System.out.println("Static method inside interface");
	}
	
	// Private method (Java 9+)
	private void log() {
		System.out.println("Private helper method");
	}
	
	public static void main(String[] args) {
		// Access static members directly
		System.out.println("Company: " + COMPANY);
		show();  // call static method
	}
}
