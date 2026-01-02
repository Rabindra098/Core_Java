package String_Arrays;

public class LargestAndSmalest {
	public static void main(String[] args) {
		int []arr= {3,2,6,83,28,36,66,8,87};
		int max=arr[0], min=arr[0];
		for(int i:arr) {
			if(i>max)
				max=i;
			if(i<min)
				min=i;
		}
		System.out.println(max);
		System.out.println(min);
	}
}
