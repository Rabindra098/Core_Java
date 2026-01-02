package Multithreading;

public class ThreadDemo extends Thread{
	public static void main(String[] args) {
		ThreadDemo td1=new ThreadDemo();
		ThreadDemo td2=new ThreadDemo();
		td1.start();
		td2.start();
	}
	@Override
	public void run() {
		System.out.println("ThreadDemo.run()");
	}
}
