package com.String_Sep10;

import java.util.Scanner;
public class Pr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a' && ch[i]<='z') {
				if(i==0 || ch[i-1]==' ') {
					ch[i]-=32;
				}
			}
		}
		System.out.println(ch);
	}

}
