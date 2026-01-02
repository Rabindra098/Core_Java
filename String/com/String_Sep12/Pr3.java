package com.String_Sep12;

public class Pr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="BOSSSSSSSSSS";
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j+=2) {
				if(ch[i]==ch[j]) {
					ch[j]='$';
					//break;
				//	j++;
				}
			}
		}
		System.out.println(ch);
	}

}
