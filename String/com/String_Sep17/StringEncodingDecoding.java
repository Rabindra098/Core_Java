package com.String_Sep17;

public class StringEncodingDecoding {
	public static void main(String[] args) {
		System.out.println(encode("xyz",2));
	//	System.out.println(decode("Jgnnq Iwffw",2));
	}
	public static String encode(String s,int n) {
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(Character.isUpperCase(ch[i])) {
				
				ch[i] = (char) ((ch[i] - 'A' + n + 26) % 26 + 'A');
			}
			else if(Character.isLowerCase(ch[i])){
				
				ch[i] = (char) ((ch[i] - 'a' + n + 26) % 26 + 'a');
			}
		}
		//return ch+""; Address will print.
		return new String(ch);
	}
	public static String decode(String s,int n) {
		return encode(s,-n);
	}
}
