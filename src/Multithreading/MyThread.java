package Multithreading;

public class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("Child thread is running...");
		System.out.println("It is running with separate stack");

	}
	

	public static void main(String[] args) {
//		System.out.println("Main Thread is started..");
//		MyThread f = new MyThread();
//		System.out.println("Thread has not started yet so :" + f.isAlive());
//		f.start(); // new Thread has created
//		System.out.println("Thread has started so :" + f.isAlive());
//		
		System.out.println("Main Thread Started");
		MyThread s1 = new MyThread();
		MyThread s2 = new MyThread();
		s1.start();
		s2.start();
		System.out.println(10/0);
		System.out.println("Main Thread Ended");


	}
}
