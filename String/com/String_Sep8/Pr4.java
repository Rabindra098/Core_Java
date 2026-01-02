package com.String_Sep8;

import java.util.Scanner;

public class Pr4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.nextLine();
		
		String s1=s.toLowerCase();
		String vow="";
		int vowCount=0;
		
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vow+=ch;
				vowCount++;
			}
		}
		System.out.println(vow);
		System.out.println(vowCount);
	}

}
