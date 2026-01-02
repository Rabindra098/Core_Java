package Multithreading;

class TName {
	public void printThreadName() {
		String name = Thread.currentThread().getName();
		System.out.println("Thread inside the method is :" + name);
		synchronized (this) {
			for (int i = 0; i <= 10; i++) {
				try {
					System.out.println("i value is :" + i + " by :" + name);
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
			System.out.println(".............................");
		}
	}
}

public class BlockSynchronization {
	public static void main(String[] args) {
		TName obj1 = new TName(); // lock is created
		Runnable r1 = () -> obj1.printThreadName();
		Thread t1 = new Thread(r1, "Child1");
		Thread t2 = new Thread(r1, "Child2");
		t1.start();
		t2.start();

	}
}
