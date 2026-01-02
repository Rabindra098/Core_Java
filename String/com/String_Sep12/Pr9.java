package com.String_Sep12;

public class Pr9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Krishna";
		String s2="Radha";
		System.out.println("Before Swapping...");
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		
		System.out.println("After Swapping...");
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
	}

}
