package com.String_Sep10;

import java.util.Scanner;

public class Pr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence :");
		String s=sc.nextLine();
		String str="";
		
		//java is easy
		
		int i=s.length()-1;
		int j=s.length()-1;
		
		while(i>=0) {
			while(i>=0 && s.charAt(i)!=' ') i--;
			
			int k=i+1;
			while(k<=j) {
				str+=s.charAt(k);
				k++;
			}
			if(i>=0) {
				str+=" ";
			}
			i--;
			j=i;
		}
		System.out.println(str);
	}

}
