package pack2;

public class ClassAV
{
	void meth1()
	{
		System.out.println("meth1() called\n");
		int arr[]={10,20,30,40,50};
		System.out.println(arr[0]+"\n");
		System.out.println("using for loop to reterive the data from an arr");
		for(int i=0;i<=4;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=4;i>=0;i--)
		{
			System.out.print(i+"");
		}
		System.out.println("\n\nusing for loop to reterive the data from an arr");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
	public static void main(String[] args) 
	{
		ClassAV aobj = new ClassAV();
		aobj.meth1();
	}
}
/*
	-->for loop will be reteriveing the data from an array by using its index position.
	-->for-each loop will be working on String data.(It does not works on index position)
	-->So we can't reterive the data in a reverse order by using for-each loop.
	-->for-each loop is used ONLY to retrive the data from an Array (or) for collection classes.
*/
