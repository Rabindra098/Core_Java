package sep22;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,23,45,66,90};
		int key=495;
		
		System.out.println(search(a,key));
	}
	public static int search(int a[],int key) {
		int st=0;
		int end=a.length-1;
		
		while(st<=end) {
		int mid=(st+end)/2;
		
		if(a[mid]==key) return mid;
		
		if(key<a[mid]) end=mid-1;
		
		else st=mid+1;
		
		}
		return -1;
	}

}
