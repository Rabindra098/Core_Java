package com.String_Sep9;

public class Pr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aBcDeF";
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A'&& ch[i]<='Z') ch[i]+=32; //ch[i]=(char)ch[i]+32;
			else if(ch[i]>='a'&& ch[i]<='z') ch[i]-=32;
		}
		System.out.println(ch);
	}

}
