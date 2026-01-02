package sep22;

public class BinarySearchRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,23,45,66,90};
		int key=45;
		System.out.println(search(a,key,0,a.length-1));
	}
	public static int search(int a[],int key,int st,int end) {
		if(st>end) return -1;
		
		int mid=(st+end)/2;
		
		if(a[mid]==key) return mid;
		
		if(key<a[mid]) return search(a,key,st,mid-1);	
		else return search(a,key,mid+1,end);
	}

}
