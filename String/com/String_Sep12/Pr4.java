package com.String_Sep12;

public class Pr4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="javadev";
		String newStr=s.toLowerCase();
		char ch[]=newStr.toCharArray();
		int vowCount=0;
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a' || ch[i]=='e' ||ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u') {
				vowCount++;
			}
			if(vowCount>=3) {
				for(int j=0;j<ch.length;j++) {
					if(ch[j]=='a' || ch[j]=='e' ||ch[j]=='i' ||ch[j]=='o' ||ch[j]=='u') {
						ch[j]='_';
					}
				}
			}	
		}
		System.out.println(ch);
	}

}
