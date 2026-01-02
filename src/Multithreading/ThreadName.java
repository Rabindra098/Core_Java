package Multithreading;

public class ThreadName {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println("Thread Name : "+thread.getName());
	}
}
