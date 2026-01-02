package sep25;

public class Number {

	public static void main(String[] args) 
	{
		int num=965657575;
		convert((num/10000000)," crores ");
		convert((num/100000)%100," lakhs ");
		convert((num/1000)%100," thousands ");
		convert((num/100)%100," hundreds ");
		convert(num%100,"");
		
	}
	
	public static void convert(int n,String s)
	{
		String[] one= {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String[] two= {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		
		if(n<=19)
		{
			System.out.print(one[n]+ "");
		}
		
		else
		{
			System.out.print(two[n/10]+" "+one[n%10]+" ");
		}
		if(n!=0)
		{
			System.out.print(s);
		}
	}

	
}