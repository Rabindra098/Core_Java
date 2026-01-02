package sep20;

public class Even_Elements {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		for(int evenEle:arr) {
			if(evenEle%2==0) {
				System.out.println(evenEle);
			}
		}
	}
}
