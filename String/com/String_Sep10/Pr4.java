package com.String_Sep10;

import java.util.Scanner;

public class Pr4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence :");
		String s=sc.nextLine();
		String newStr=s.toLowerCase();
		char ch[]=newStr.toCharArray();
		int wordCount=0;
		
		for(int i=0;i<newStr.length();i++) {
			if(ch[i]>='a' && ch[i]<='z') {
				if(i==0 || ch[i-1]==' ' ) wordCount++;
			}
		}
		System.out.println(wordCount);
	}
}
