package Multithreading;
class Table{
	public synchronized void printTable(int num) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(num+" X "+i+" = "+(num*i));
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class MethodLevelSynchronization {
	public static void main(String[] args) {
		Table obj = new Table();
		Thread t1 = new Thread() {
			@Override
			public void run() {
				obj.printTable(5);
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				obj.printTable(10);
			}
		};
		Thread t3 = new Thread() {
			@Override
			public void run() {
				obj.printTable(15);
			}
		};
		t1.start();
		t2.start();
		t3.start();
		
	}
}
