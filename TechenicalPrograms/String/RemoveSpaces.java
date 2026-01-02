package String;

public class RemoveSpaces {
	public static void main(String[] args) {
		String str="Ja va Is A w eSo m e !";
		String result="";
		for(char c:str.toCharArray()) {
			if(c != ' ')
				result =result+c;
		}
		System.out.println(result);
	}
}
