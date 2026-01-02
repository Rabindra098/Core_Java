package com.String_Sep15;

public class MissingVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vowels="AEIOUaeiou";
		String s1="India";
		String res="";
		
		for(int i=0;i<vowels.length();i++) {
			char ch=vowels.charAt(i);
			
			if(!s1.contains(ch+"")) res+=ch;
		}
		System.out.println(res);
	}

}
