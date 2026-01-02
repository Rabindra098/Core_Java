package Multithreading;

public class RunnableInnerClass {
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				String name1 = Thread.currentThread().getName();
				System.out.println("Child Thread Name is : "+name1);
				
			}
		};
		String name2 = Thread.currentThread().getName();
		System.out.println("Parent Thread Name : "+name2);
		Thread t1 = new Thread(runnable,"Scott");
		t1.start();
	}
}
