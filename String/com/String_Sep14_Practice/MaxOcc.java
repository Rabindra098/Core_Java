package com.String_Sep14_Practice;

public class MaxOcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="javadeva";
		String s2="";
		int maxCount=0;
		char maxChar=' ';
		
		while(s1.length()>0) {
			char ch=s1.charAt(0);
			s2=s1.replace(ch+"","");
			int count=s1.length()-s2.length();
			
			if(count>maxCount) {
				maxCount=count;
				maxChar=ch;
			}
			
			s1=s2;
		}
		System.out.println(maxChar+" = "+maxCount);
	}

}
