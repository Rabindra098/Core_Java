
package com.String_Sep11;

import java.util.Scanner;

public class Pr4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			//if(ch[i]==' ') ch[i]='\u0000';
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					char temp=ch[i];
					ch[i]=ch[j];	
					ch[j]=temp;
				}
			}
		}
		System.out.println(ch);
	}

}
