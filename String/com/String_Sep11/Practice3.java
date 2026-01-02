package com.String_Sep11;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="javadev";
		String res="";
		char ch[]=s.toCharArray();
		
		for(int i=0;i<s.length();i++) {
			int count=1;
			if(ch[i]=='\u0000') continue;
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='\u0000';
				}
			}
			if(count==1) {
				res+=ch[i];
			}
		}
		System.out.println(res);
	}

}
