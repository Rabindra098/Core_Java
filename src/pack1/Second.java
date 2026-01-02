package pack1;

public class Second {
	public static void main(String[] args) {
		String str="itamati";
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)!=' ')
			count++;
		}
		System.out.println("Total Number of char in string "+count);
	}

}
