package com.String_Sep9;

import java.util.Scanner;

public class Pr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.nextLine();
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			rev+=ch;
		}
		if(s.equals(rev)) {
			System.out.println("Pallindrome String");
		}
		else {
			System.out.println("Not a Pallindrome String");
		}
	}

}
