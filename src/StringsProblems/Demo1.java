package StringsProblems;

public class Demo1 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		String s="";
		if(sb.equals(s))
			System.out.println("match1");
		else if(sb.toString().equals(s))
			System.out.println("match2");
		else
			System.out.println("No one can be match");
	}
}
