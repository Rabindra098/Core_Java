package Multithreading;

public class RunnableUsingLambda {
	public static void main(String[] args) {
		Runnable r1 = () -> 
		System.out.println("Current Thread nameis :" + Thread.currentThread().getName());
		new Thread(r1,"Rabi").start();
	}
}
