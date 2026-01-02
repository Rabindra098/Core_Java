package pack2;

public class ClassCQ {
	void meth() {
		int iteration = 100000;
		String data = "a";
		long startTime = System.currentTimeMillis();
		String str = "";
		for (int i = 0; i < iteration; i++) {
			str += data;
		}
		long endTime = System.currentTimeMillis();
		long StringDuration = endTime - startTime;
		startTime = System.currentTimeMillis();
		StringBuffer StringBuffer = new StringBuffer();
		for (int i = 0; i < iteration; i++) {
			StringBuffer.append(data);
		}
		endTime = System.currentTimeMillis();
		long StringBufferDuration = endTime - startTime;
		startTime = System.currentTimeMillis();
		StringBuilder StringBuilder = new StringBuilder();
		for (int i = 0; i < iteration; i++) {
			StringBuilder.append(data);
		}
		endTime = System.currentTimeMillis();
		long StringBuilderDuration = endTime - startTime;
		System.out.println("Time taken for String Concatination :" + StringDuration);
		System.out.println("Time taken for StringBuffer Concatination :" + StringBufferDuration);
		System.out.println("Time taken for StringBuilder Concatination :" + StringBuilderDuration);
	}

	public static void main(String[] args) {
		new ClassCQ().meth();
	}
}
