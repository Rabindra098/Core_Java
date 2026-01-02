package Multithreading;

class General implements Runnable {
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " is booking General Ticket");
	}
}

class Tatkal implements Runnable {
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " is booking Tatkal Ticket");
	}
}

public class AssigningTarget {
	public static void main(String[] args) {
		Thread general = new Thread(new General(), "Scott");
		Thread tatkal = new Thread(new Tatkal(), "Smith");
		general.start();
		tatkal.start();
	}
}
