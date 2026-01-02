package String_Arrays;

public class FinalizeConcept {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("FinalizeConcept.finalize()");
	}
	public static void main(String[] args) {
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
//		f1=null;
		
		f2=null;
		
		System.gc();
		System.out.println("FinalizeConcept.main()");
		
	}
}
