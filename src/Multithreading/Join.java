package Multithreading;

public class Join extends Thread {
	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		for (int i = 0; i <= 5 ; i++) {
			System.out.println("i Value is "+i+" by "+name);
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Join j1 = new Join();
		Join j2 = new Join();
		Join j3 = new Join();
		j1.setName("j1");
		j2.setName("j2");
		j3.setName("j3");
		j1.start();
		j1.join();//putting the main thread in waiting mood
		j2.start();
		j3.start();
		System.out.println("Main Thread ended!!!");

		
	}
}
