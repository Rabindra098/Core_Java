package com.String_Sep8;

import java.util.Scanner;
public class Pr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.nextLine();
		String revStr="";
		
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			revStr+=ch;
		}
		System.out.println(revStr);
	}

}
