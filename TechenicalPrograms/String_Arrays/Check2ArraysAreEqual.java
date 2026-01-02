package String_Arrays;

import java.util.Arrays;

public class Check2ArraysAreEqual {
	public static void main(String[] args) {
		int a1[] = { 1, 2, 3, 4, 5, 6 };
		int a2[] = { 1, 2, 3, 4, 5, 6 };
		//1. Approach
		boolean status = Arrays.equals(a1, a2);
		if(status==true)
			System.out.println("Two Arrays Are Equal");
		else
			System.out.println("Two Arrays Are Not Equal");
		
		//2. Approach
		boolean status1=true;
		if(a1.length==a2.length)
			for (int i = 0; i < a1.length; i++) {
				if(a1[1]!=a2[2])
					status1=false;
			}
		else
			status1=true;
		if(status1==false)
			System.out.println("Two Arrays Are Equal");
		else
			System.out.println("Two Arrays Are Not Equal");
		
	}
}
