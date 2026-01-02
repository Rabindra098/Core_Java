 package com.String_Sep9;

import java.util.Scanner;

public class Pr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an AlphaNumeric String: ");
		String s=sc.nextLine();
		
		int sum=0;
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			if(ch>='0'&&ch<='9') sum+=ch-'0';
//			sum+=Integer.parseInt(ch+"");
		}
		System.out.println(sum);
	}

}
