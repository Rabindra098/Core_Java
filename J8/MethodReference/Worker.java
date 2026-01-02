package MethodReference;

@FunctionalInterface
public interface Worker {
	void work();

	public interface worker2 {
		void work(double salary);
	}
}
