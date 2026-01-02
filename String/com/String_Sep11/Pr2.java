package com.String_Sep11;

import java.util.Scanner;

public class Pr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		String res="";
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='\u0000') continue;
			
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					res+=ch[i];
					ch[j]='\u0000';
				}
			}
		}
		System.out.println(res);
	}

}
