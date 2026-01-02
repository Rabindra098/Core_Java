package com.String_Sep11;

import java.util.Scanner;

public class Pr2_adv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		String res="";
		
		for(int i=0;i<ch.length;i++) {
			int count=1;
			if(ch[i]=='\u0000') continue;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='\u0000';
				}
			}
			if(count>1) {
				res+=ch[i];
			}
		}
		System.out.println(res);
	}
}
	
