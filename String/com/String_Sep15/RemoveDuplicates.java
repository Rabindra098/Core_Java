package com.String_Sep15;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="javadev";
		String res="";
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(!res.contains(ch+"")) {
				res+=ch;
			}
		}
		System.out.println(res);
	}

}
