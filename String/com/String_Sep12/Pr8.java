package com.String_Sep12;

public class Pr8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="  java     is    easy   ";
		String newStr=s.trim();
		char ch[]=newStr.toCharArray();
		String res="";
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ') {
				res+=ch[i];
			}
			
			else if(ch[i]==' ' && ch[i-1]!=' ') {
					res+=ch[i];
			}
		}
		System.out.println(res);
	}

}
