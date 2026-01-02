package String_Arrays;

public class SecondHighest {
	public static void main(String[] args) {
		int []arr= {5,24,25,28,4,2,9,0,4,6};
		int highest=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		
		for(int num:arr) {
			if(num>highest) {
				second=highest;
				highest=num;
			}
			else if(num>second && num!= highest) {
				second=num;
			}
		}
		System.out.println("Second Highest :"+second);
	}
}
