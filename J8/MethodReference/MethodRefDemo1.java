package MethodReference;

import MethodReference.Worker.worker2;

public class MethodRefDemo1 {
	public static void main(String[] args) {
		//writing lamda exp
		Worker w1=()->System.out.println("Worker is Working");
		w1.work();
		//writing method ref
		Worker w2=new Employee()::work;
		w2.work();
		Worker w3=Employee::salary;
		w3.work();
		
		worker2 w4=Employee::salary;
		w4.work(300000);
	}
}
