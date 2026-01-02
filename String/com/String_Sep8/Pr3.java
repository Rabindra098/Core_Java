package com.String_Sep8;

import java.util.Scanner;

public class Pr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.nextLine();
		
		String uc="";
		String lc="";
		String num="";
		String sp="";
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z') uc+=ch;
			else if(ch>='a' && ch<='z') lc+=ch;
			else if(ch>='0' && ch<='9') num+=ch;
			else sp+=ch;
		}
		String res=num+lc+sp+uc;
		System.out.println(res);
	}

}
