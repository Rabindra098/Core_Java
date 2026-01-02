package BasicPrograms;

public class ReverceString {
	public static void main(String[] args) {
		String name="Rabi";
		char [] ch=name.toCharArray();
		String rev="";
		for (int i = ch.length-1; i >= 0 ; i--) {
			rev=rev+ch[i];
		}
		System.out.println("before : "+name);
		System.out.println("After : "+rev);
	}
}
