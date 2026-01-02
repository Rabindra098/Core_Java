package String_Arrays;

import java.sql.Statement;
import java.util.Arrays;

public class LargestAndSmalestNum {
	public static void main(String[] args) {
		int [] numbers= {-98,27,3,28,93872,-3872,-83};
		int largest=numbers[0];
		int smalest=numbers[0];
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] > largest)
				largest=numbers[i];
			else if(numbers[i]<smalest)
				smalest=numbers[i];
		}
		System.out.println(Arrays.toString(numbers));
		System.out.println(largest);
		System.out.println(smalest);
	}
}
