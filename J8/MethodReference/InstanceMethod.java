package MethodReference;

public class InstanceMethod {
	public  void getTraining1(String name,int exp) {
		System.out.println("Trainer name is "+name+" having "+exp+" years experience");
	}
	public static  void getTraining2(String name,int exp) {
		System.out.println("Trainer name is "+name+" having "+exp+" years experience");
	}
	public static void main(String[] args) {
		//using lamda exp
		Trainer t1=(name,exp)->System.out.println("Trainer name is "+name+" having "+exp+" years experience");
		t1.getTraining("Ramesh", 3);
		//using method ref
		Trainer t2=new InstanceMethod()::getTraining1;
		t2.getTraining("Hari", 3);
		
		Trainer t3= InstanceMethod::getTraining2;
		t3.getTraining("Hari", 3);
	}
}
