package com.String_Sep8;

import java.util.Scanner;
public class Pr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.nextLine();
		
		int uc=0;
		int lc=0;
		int num=0;
		int sp=0;
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z') uc++;
			else if(ch>='a' && ch<='z') lc++;
			else if(ch>='0' && ch<='9') num++;
			else sp++;
			}
		System.out.println("UpperCase: "+uc+" LowerCase: "+lc+" SpecialCharacter: "+sp+" Number: "+num);
	}

}
