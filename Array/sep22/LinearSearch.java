package sep22;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,20,50,10,5,9};
		int key=5;
		System.out.println(lSearch(a,key));
	}
	
	public static int lSearch(int a[],int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) return i;
		}
		return -1;
	}

}
