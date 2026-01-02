package com.String_Sep11;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="javadev";
		String res="";
		char ch[]=s.toCharArray();
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j]) {
					res+=ch[i];
				}
			}
		}
		System.out.println(res);
	}

}
