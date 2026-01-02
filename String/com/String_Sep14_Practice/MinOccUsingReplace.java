package com.String_Sep14_Practice;

public class MinOccUsingReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="javadevva";
		String s2="";
		int minCount=s1.length();
		char minChar=' ';
		
		while(s1.length()>0) {
			char ch=s1.charAt(0);
			s2=s1.replace(ch+"", "");
			int count=s1.length()-s2.length();
			
			if(count<minCount) {
				minCount=count;
				minChar=ch;
			}
			s1=s2;
		}
		System.out.println(minChar+" = "+minCount);
	}

}
