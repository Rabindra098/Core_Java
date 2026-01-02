package String;

public class StringRotation {
	public static void main(String[] args) {
		String s1="abcdd";
		String s2="cdadb";
		if(s1.length()==s2.length() && (s1+s2).contains(s2)) 
			System.out.println("These two String are Rotationg");
		else
			System.out.println("These two String are not Rotationg");
		
	}
}
