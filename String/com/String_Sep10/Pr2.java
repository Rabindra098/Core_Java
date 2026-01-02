package com.String_Sep10;

import java.util.Scanner;
public class Pr2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence :");
		String s=sc.nextLine();
		String str="";
		
		int i=0;
		int j=0;
		
		while(j<s.length()) {
			while(j<s.length() && s.charAt(j)!=' ') j++;
			
			int k=j-1;
			while(k>=i) {
				str+=s.charAt(k);
				k--;
			}
			if(j<=s.length())
			str+=" ";
			
			j++;
			i=j;
		}
		System.out.println(str);
	}
}
