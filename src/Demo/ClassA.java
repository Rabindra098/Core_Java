package Demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ClassA {
	public static void main(String[] args) {
		ClassA a=new ClassA();
		String result=a.reverse("Rabindra");
//		System.out.println(result);
		boolean result1=a.isPalindrome("ItamatI");
//		System.out.println(result1);
		boolean result2=a.isAnagram("Hello", "hello");
//		System.out.println(result2);
		 int[] arr = {1, 2, 3, 2, 4, 3, 5, 1};
		a.findDuplicate(arr);
		int result3=a.stringLength("Hello World","Java is awesome!");
		System.out.println(result3);

	}
	public String reverse(String input) {
		return new StringBuilder(input).reverse().toString();
	}
	public boolean isPalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i++) != str.charAt(j--))
				return false;
		}
		return true;
	}
	public boolean isAnagram(String s1,String s2) {
		char [] a1=s1.toCharArray(),a2=s2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		return Arrays.equals(a1, a2);
	}
	public void findDuplicate(int [] arr) {
		Set set = new HashSet<>();
		for (int num : arr) {
		    if (!set.add(num)) System.out.println("Duplicate: " + num);
		}
	}
	public int stringLength(String str1,String str2) {
		int count1=0;
		int count2=0;
		for (int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i)!=' ')
				count1++;
		}
		for (int i = 0; i < str2.length(); i++) {
			if(str2.charAt(i)!=' ')
				count2++;
		}
		System.out.println(count1);
		System.out.println(count2);
		return count1+count2;
	}
	
}
